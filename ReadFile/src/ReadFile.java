import java.io.*;
import java.util.*;
import java.util.Scanner;
public class ReadFile {
	public static void main(String[] args) {
		double[] rainfall = populateArray();
		for(int i = 0; i < rainfall.length; i++) {
		System.out.println(rainfall[i]);
		}
		printMenu();
		
		Scanner keyboard = new Scanner(System.in);
		String command = keyboard.nextLine();
			switch (command.toLowerCase()) {
				case "highest":
					System.out.println("highest");
					findHighestYearIndex(rainfall);
					System.out.println(Arrays.toString(rainfall));
					break;
				case "lowest":
					System.out.println("lowest");
					findLowestYearIndex(rainfall);
					System.out.println(Arrays.toString(rainfall));
					break;
				case "average":
					System.out.println("average");
					findAverage(rainfall);
					System.out.println(Arrays.toString(rainfall));
					break;
				case "quit":
					break;
				default:
					System.out.println("Error: Please try again");
					printMenu();
			}		
		
		System.out.println("End of Program");
		keyboard.close();
				
		}

	
	
	public static double[] populateArray() {
		try {
			// Creating file object
			File f = new File("rainfall.txt");
			// Loading file object into scanner
			Scanner sc = new Scanner(f);
		
			// Create and initialize a new array of 168 items
			double[] rainfallArray = new double[168];
			
			// Assign values to array
			for (int i = 0; i < 168; i++) {
				// Grab the next value from the file
				rainfallArray[i] = sc.nextDouble();
			}
			
			sc.close();
			return rainfallArray;

		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found");
			return null;
		}
	}
	public static void printMenu() {
		System.out.println("What about the rainfall from 1849 to 2016 would you like to know?");
		System.out.println("Options are: highest, lowest, average and quit.");
		System.out.println("Please enter the option you desire");
	}
	public static double findHighestYearIndex(double[] array) {
		int index = 0;
		double highest = 0.0;
		while(index < array.length) {
			if(array[index] > highest) {
				highest = array[index];
			}
			index++;
		}
		return highest;
	}
	
	public static double findLowestYearIndex(double[] array) {
		int index = 0;
		double lowest = array[index];
		while(index < array.length) {
			if(array[index] < lowest) {
				lowest = array[index];
			}
			index++;
		}
		return lowest;
	}

	public static double findAverage(double[] array) {
		double average = 0.0;
			for(int i = 0; i < array.length; i++) {
				average = average + array[i];
			}
			average = average / 168;
			return average;
		}
	}
