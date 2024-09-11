#include <iostream>
#include <string>
#include <cstring>
#include <cstdlib>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

#define MAX_INPUT_SIZE 1024
#define MAX_ARGS 100

int execute_command(char *args[]);
int handle_builtin(char *args[]);

int main() {
    char input[MAX_INPUT_SIZE];
    char *args[MAX_ARGS];
    int should_run = 1;

    while (should_run) {
        std::cout << "ash > ";
        std::cout.flush();

        if (!std::cin.getline(input, sizeof(input))) {
            break; // End of input (e.g., EOF)
        }

        int arg_count = 0;
        char *token = strtok(input, " \t\n");
        while (token != NULL) {
            args[arg_count] = token;
            arg_count++;

            if (arg_count >= MAX_ARGS) {
                std::cerr << "Too many arguments." << std::endl;
                break;
            }

            token = strtok(NULL, " \t\n");
        }
        args[arg_count] = NULL;

        if (arg_count > 0) {
            if (strcmp(args[0], "exit") == 0) {
                should_run = 0;
            } else if (strcmp(args[0], "cd") == 0) {
                if (arg_count != 2) {
                    std::cerr << "Usage: cd <directory>" << std::endl;
                } else {
                    if (chdir(args[1]) != 0) {
                        perror("cd");
                    }
                }
            } else {
                execute_command(args);
            }
        }
    }

    return 0;
}

int execute_command(char *args[]) {
    pid_t child_pid = fork();

    if (child_pid == 0) {
        // Child process
        if (execvp(args[0], args) == -1) {
            perror("execvp");
            exit(EXIT_FAILURE);
        }
    } else if (child_pid > 0) {
        // Parent process
        int status;
        waitpid(child_pid, &status, 0);
        if (WIFEXITED(status) && WEXITSTATUS(status) != 0) {
            std::cerr << "Command failed with exit status " << WEXITSTATUS(status) << std::endl;
        }
    } else {
        perror("fork");
        return 1;
    }

    return 0;
}
