import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;  

public class InputFile {
	public static void main(String[] args) throws FileNotFoundException{
		try {
			File f = new File("C:\\Users\\nisel\\OneDrive\\Desktop\\NC A&T SU School Work\\Java Programming Assignments\\Major Project 2.txt");
			Scanner file = new Scanner(f);
			Scanner scan = new Scanner(System.in);
			MowerWareHouse mowerStore = new MowerWareHouse();
			LawnTractor mower1 = new LawnTractor();
			CommercialMower mower2 = new CommercialMower();
			GasPoweredMower mower3 = new GasPoweredMower();
			PushReelMower mower4 = new PushReelMower();
			LawnTractor mower5 = new LawnTractor();
			ArrayList<Mower> mower = new ArrayList<Mower>();
			String choice = "";
		
			mowerStore.setStoreName(file.nextLine());

			mower1.setManufacturer(file.nextLine());
			mower1.setYear(Integer.parseInt(file.nextLine()));
			mower1.setSerialNumber(file.nextLine());
			mower1.setType(file.nextLine());
			mower1.setEngine(file.nextLine(),Double.parseDouble(file.nextLine()),Integer.parseInt(file.nextLine()));
			mower1.setModel(file.nextLine());
			mower1.setDeckWidth(Double.parseDouble(file.nextLine()));
		
			mower2.setManufacturer(file.nextLine());
			mower2.setYear(Integer.parseInt(file.nextLine()));
			mower2.setSerialNumber(file.nextLine());
			mower2.setType(file.nextLine());
			mower2.setEngine(file.nextLine(),Double.parseDouble(file.nextLine()),Integer.parseInt(file.nextLine()));
			mower2.setModel(file.nextLine());
			mower2.setDeckWidth(Double.parseDouble(file.nextLine()));
			mower2.setOperatingHours(Double.parseDouble(file.nextLine()));
			mower2.setZeroTurnRadius(Boolean.parseBoolean(file.nextLine()));
		
			mower3.setManufacturer(file.nextLine());
			mower3.setYear(Integer.parseInt(file.nextLine()));
			mower3.setSerialNumber(file.nextLine());
			mower3.setType(file.nextLine());
			mower3.setCutWidth(Double.parseDouble(file.nextLine()));
			mower3.setWheelDiameter(Double.parseDouble(file.nextLine()));
			mower3.setEngine(file.nextLine(),Double.parseDouble(file.nextLine()),Integer.parseInt(file.nextLine()));
			mower3.setSelfPropelled(Boolean.parseBoolean(file.nextLine()));
		
			mower4.setManufacturer(file.nextLine());
			mower4.setYear(Integer.parseInt(file.nextLine()));
			mower4.setSerialNumber(file.nextLine());
			mower4.setType(file.nextLine());
			mower4.setCutWidth(Double.parseDouble(file.nextLine()));
			mower4.setWheelDiameter(Double.parseDouble(file.nextLine()));
			mower4.setWheels(Integer.parseInt(file.nextLine()));
		
			mower5.setManufacturer(file.nextLine());
			mower5.setYear(Integer.parseInt(file.nextLine()));
			mower5.setSerialNumber(file.nextLine());
			mower5.setType(file.nextLine());
			mower5.setEngine(file.nextLine(),Double.parseDouble(file.nextLine()),Integer.parseInt(file.nextLine()));
			mower5.setModel(file.nextLine());
			mower5.setDeckWidth(Double.parseDouble(file.nextLine()));
		
		
			mower.add(mower1);
			mower.add(mower2);
			mower.add(mower3);
			mower.add(mower4);
			mower.add(mower5);
			
			while(!choice.equals("S")) {
				System.out.println("Enter your choice of Mower to get Information!");
				System.out.println("Type C for Commercial Mowers, Type G for Gas Powered Mowers, Type L for LawnTractors, and Type S to stop!");
				choice = scan.next();
				if(choice.equals("C")) {
					System.out.print(mower2.getManufacturer() + ", ");
					System.out.print(mower2.getYear() + ", ");
					System.out.print(mower2.getSerialNumber() + ", ");
					System.out.print(mower2.getType() + ", ");
					System.out.print(mower2.getEngine().getManufacturer() + ", ");
					System.out.print(mower2.getEngine().getHoursePower() + ", ");
					System.out.print(mower2.getEngine().getCylinder() + ", ");
					System.out.print(mower2.getModel() + ", ");
					System.out.print(mower2.getDeckWidth());
				}
				else if(choice.equals("G")) {
					System.out.print(mower3.getManufacturer() + ", ");
					System.out.print(mower3.getYear() + ", ");
					System.out.print(mower3.getSerialNumber() + ", ");
					System.out.print(mower3.getType() + ", ");
					System.out.print(mower3.getCutWidth() + ", ");
					System.out.print(mower3.getWheelDiameter() + ", ");
					System.out.print(mower3.getEngine().getManufacturer() + ", ");
					System.out.print(mower3.getEngine().getHoursePower() + ", ");
					System.out.print(mower3.getEngine().getCylinder() + ", ");
					System.out.print(mower3.getSelfPropelled());
				}
				else if(choice.equals("L")) {
					System.out.print(mower1.getManufacturer() + ", ");
					System.out.print(mower1.getYear() + ", ");
					System.out.print(mower1.getSerialNumber() + ", ");
					System.out.print(mower1.getType() + ", ");
					System.out.print(mower1.getEngine().getManufacturer() + ", ");
					System.out.print(mower1.getEngine().getHoursePower() + ", ");
					System.out.print(mower1.getEngine().getCylinder() + ", ");
					System.out.print(mower1.getModel() + ", ");
					System.out.print(mower1.getDeckWidth());
					System.out.println();
					System.out.print(mower5.getManufacturer() + ", ");
					System.out.print(mower5.getYear() + ", ");
					System.out.print(mower5.getSerialNumber() + ", ");
					System.out.print(mower5.getType() + ", ");
					System.out.print(mower5.getEngine().getManufacturer() + ", ");
					System.out.print(mower5.getEngine().getHoursePower() + ", ");
					System.out.print(mower5.getEngine().getCylinder() + ", ");
					System.out.print(mower5.getModel() + ", ");
					System.out.print(mower5.getDeckWidth());
					
				}
				else if(choice.equals("P")) {
					System.out.print(mower4.getManufacturer() + ", ");
					System.out.print(mower4.getYear() + ", ");
					System.out.print(mower4.getSerialNumber() + ", ");
					System.out.print(mower4.getType() + ", ");
					System.out.print(mower4.getCutWidth() + ", ");
					System.out.print(mower4.getWheelDiameter() + ", ");
					System.out.print(mower4.getWheels());
				}
				else if(choice.equals("S")){
					System.out.println();
				}
				else {
					System.out.println("Your choice is invalid");
				}
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("The file is Invalid! Please try again!");
		}
	}

}
