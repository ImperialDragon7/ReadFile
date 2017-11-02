import java.io.*;
import java.util.Scanner;
public class ReadFile {
	public static void main(String[] args) {
		try {
			File f = new File("test.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNextDouble()) {
				System.out.println(sc.nextDouble());
			}
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found");
		}
		Scanner txt = new Scanner(new File("test.txt"));
		
		
		while(txt.hasNextDouble()) {
			int i = 0;
			double[] rainfallArray = new double[168];
			rainfallArray[i] = txt.nextDouble();
		}
		double[] d = new double[5];
		double[] a = populateArray();

		
	}
	public static double[] populateArray() {
		Scanner keyboard = new Scanner(System.in);
		double[] a = new double[168];
		for(int i = 0; i < a.length; i++) 
			a[i] = keyboard.nextDouble();
		return a;
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

}
