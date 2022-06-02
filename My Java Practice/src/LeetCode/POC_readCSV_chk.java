package LeetCode;
import java.io.*;
import java.util.*;
//import java.nio.file.*;

public class POC_readCSV_chk {
	
	public static void main(String[] args) throws IOException {
		
		String line ="";
		String schema="ID,Name,Age,Address";
		try {
		BufferedReader br = new BufferedReader(new FileReader("D:\\Akash_Talend_POC\\SampleCsv.csv"));
		
		 line = br.readLine();
		 String[] arr = line.split(","); //first array to initialize the netezza header
		 int k =0;
		 for(;k<arr.length;k++) {
		 System.out.print(arr[k]);
		 }
		System.out.println();
		String [] arr2 = schema.split(",");// Second array to initialize the file header
		
		int i=0;
		for(;i<arr2.length;i++) {
			System.out.print(arr2[i]);
			if (arr2[i].equalsIgnoreCase(arr[k])) {
				System.out.print("Columns are same ");
			}
		}
		 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

		


