import java.io.*;
import java.util.Scanner;
public class ReadFile {
	public static void main(String[] args) {
		double[] rainfall = populateArray();
		for(int i = 0; i < rainfall.length; i++) {
		System.out.println(rainfall[i]);
		}
		
	}
	
	public static double[] populateArray() {
		try {
			// Creating file object
			File f = new File("rainfall.txt");
			// Loading file object into scanner
			Scanner sc = new Scanner(f);
			// Printing all values
			while(sc.hasNextDouble()) {
				System.out.println(sc.nextDouble());
			}
			
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
	
	public static double findHighestYearIndex() {
		
		return 0.0;
	}
	
	public static double findLowestYearIndex() {
		
		return 0.0;
	}

	public static double findAverage() {
	
		return 0.0;
	}

}
