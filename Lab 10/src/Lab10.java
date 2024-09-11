

import java.util.ArrayList;

public class Lab10 {
	ArrayList<Integer> stackArrayList = new ArrayList<Integer>();

	public void push(int num) {
          stackArrayList.add(num);
        }

	public void pop() {
		int noOfElements = stackArrayList.size();
        int index = noOfElements - 1;
        
        try {
        	stackArrayList.remove(index);
        } 
        catch (Exception e) {
        	System.out.println(e);
            System.out.println("Stack is empty!");
        }
	}

	public boolean hasItems() {
		int noOfElements = stackArrayList.size();
        if (noOfElements > 0) {
        	return true;
        } 
        else {
        	return false;
        }
	}
}


