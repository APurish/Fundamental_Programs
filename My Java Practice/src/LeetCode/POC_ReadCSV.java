package LeetCode;
import java.io.*;
import java.util.*;
import java.nio.file.*;
//import java.lang.*;


public class POC_ReadCSV {
	//public static void Read(String csvFile) throws IOException {
public static void main(String[] args) throws IOException {
		
		
		String line ="";
		Path  filepath = Paths.get("user.dir").resolve("D:\\Akash_Talend_POC\\SampleCsv.csv");

		try {
			File thefile = filepath.toFile();
		
			BufferedReader br = new BufferedReader(new FileReader(thefile));
		 //String schema="ID,Name,Age,Address";
		 line = br.readLine();
		 String[] arr = line.split(",");
		 for(int k =0;k<arr.length;k++) {
		 System.out.print(arr[k]);
		 }
		 int i=0; 
		int l =arr.length-1;
		//String [] arr2 = new String[l+1];
		
		while(i <= l) {		
		if(i!= l) {
			//System.out.print(arr[i]+",");
			//line +=arr[i];
			
		}else {
			//System.out.print(arr[i]);
			//line+=arr[i];
			}i++;
		}
		
//		System.out.println();
//		System.out.print(line.substring());
				
		List<String> lines = new ArrayList<>();
		while (line != null) {
			lines.add(line);
			line = br.readLine();
		}
		
		//arr2 = line
		br.close();
		System.out.println();
		
//		System.out.print("num of line:"+lines.size());
		if(lines.size() > 0) {
			System.out.print("File is not empty and num of records is:" +lines.size()+" & Size is : " + thefile.length()/1024 + " kb" );//+getFileSizeBytes(thefile)
		}
		
		 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
			
		}
	
	
}


    
    
    
   
   
   
   
