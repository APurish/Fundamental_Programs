package LeetCode;
import java.io.*;
import java.util.*;
//import java.lang.*;


public class POC_ReadCSV {
	//public static void Read(String csvFile) throws IOException {
public static void main(String[] args) throws IOException {
		
		
		String line ="";
		
		try {
		BufferedReader br = new BufferedReader(new FileReader("D:\\Akash_Talend_POC\\SampleCsv.csv"));
		 line = br.readLine();
		//String[] arr = new String[];
		String[] arr = line.split(",");
		//String[] arr1 =null;
		int i;
		for(i =0; i<arr.length;i++) {
			//arr1 = arr;	
			System.out.print(arr[i]+",");
			if(arr[arr.length-1] == ",") {
				arr[arr.length-1] = " ";
			}
			}			
		 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
			
		}
	
	
}


    
    
    
   
   
   
   
