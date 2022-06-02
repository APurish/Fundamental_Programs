package LeetCode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Samplecode_POC {
public static boolean CheckEquality(String[] s1 , String[] s2) {
	if (s1 == s2) {
        return true;
        
    }

    if (s1 == null || s2 == null) {
        return false;
    }

    int n = s1.length;
    if (n != s2.length) {
        return false;
    }

    for (int i = 0; i < n; i++)
    {
        if (!s1[i].equals(s2[i])) {
        	
            return false;
        }
    }

    return true;
}
public static void main(String[] args) throws IOException {
	String line ="";
	String schema="ID,Name,Age,";
	try {
	BufferedReader br = new BufferedReader(new FileReader("D:\\Akash_Talend_POC\\SampleCsv.csv"));
	
	 line = br.readLine();
	 String[] s1 = line.split(",");
	 String [] s2 = schema.split(",");
	 
	 if (CheckEquality(s1, s2)) {
         System.out.println("Both arrays are equal");
//         int n = s1.length;
//         int n1 = s2.length;
//         for(int j=0;j<n;j++) {
//         System.out.print(s1[j]);
//     	System.out.println();
//     	for(int k=0;k<n1;j++) {
//     	System.out.print(s2[k]);
     }
//	 }
     else {
         System.out.println("Both arrays are not equal");
     }
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
}
