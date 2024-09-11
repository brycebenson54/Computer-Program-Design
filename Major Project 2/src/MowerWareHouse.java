import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;  

public class MowerWareHouse {
	String storeName;
	ArrayList<Mower> mower;
	Scanner scan = new Scanner(System.in);
	
	
	public MowerWareHouse() {
		storeName = "";
	}
	
	public MowerWareHouse(String storeName, ArrayList<Mower> mower){
		this.storeName = storeName;
		this.mower = mower;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	
	public ArrayList<Mower> getMower(){
		return mower;
	}
	
	public void setMower(ArrayList<Mower> mower){
		this.mower = mower;
	}
	
	public void readMowerData(String inputFileName) {
		try {
			File f = new File(inputFileName);
			Scanner file = new Scanner(f);
			if (f.canRead()) {
				while(file.hasNext()) {
					String line = scan.nextLine();
					System.out.println(line);
				}
			}
		}
		catch(Exception e) {
			System.out.println("The File you have inputed is invalid!");
			System.out.println("Please input a different file!");
		}	
	}
	
	public void saveMowerData(String inputFileName) {
		try {
			File f = new File(inputFileName);
			
			if (f.canRead()) {	
				Scanner file = new Scanner(f);
				while(file.hasNextLine()) {
					String line = scan.nextLine();
					System.out.println(line);
				}
			}
		}
		catch(Exception e) {
			System.out.println("The File you have inputed is invalid!");
			System.out.println("Please input a different file!");
		}	
	}
	
	
	public String toString() {
		return "Store Name: " + storeName + "\nMowers : " + mower;
	}
	
}
