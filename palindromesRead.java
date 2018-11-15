import java.io.*;
import java.util.*;
import java.util.Arrays;
public class palindromesRead {

	public static void main(String[] args) throws IOException{
		String[] dirtyArray = readArray("src/palindromes.txt");
		
//		for(int i = 0; i < dirtyArray.length; i++) {
//			System.out.println(dirtyArray[i]);
//		}
		
//	    String reverse = ""; // Objects of String class
	    String[] cleanArray = new String[dirtyArray.length];
	    String[] cleanArray1 = new String[dirtyArray.length];
	    BufferedWriter output = null;
	    output = new BufferedWriter(new FileWriter("src/output.txt"));
	     
	    int length = cleanArray.length;
	    for (int i = 0; i < length; i++) {
	    	cleanArray[i] = dirtyArray[i].toLowerCase().replaceAll("[ ,:.]", "");
	    	cleanArray1[i] = "";
	    	for(int j = cleanArray[i].length() -1; j >=0; j--) {
	    		cleanArray1[i] += cleanArray[i].charAt(j);
	    	    
	    	}
    		if (cleanArray[i].equals(cleanArray1[i].toString())) {
    			output.write("The string " + cleanArray[i] + " is a palindrome.");
    			output.newLine();
    	    }else {
    	    	output.write("The string " + cleanArray[i] + " isn't a palindrome.");
    	    	output.newLine();
    	    }
		    
//		    if (cleanArray[i].equals(cleanArray1[i].toString())) {
//
//		    		System.out.println("The string " + cleanArray[i] + " is a palindrome.");
//		    }else {
//		    		System.out.println("The string " + cleanArray[i] + " isn't a palindrome.");
//		    }
		    
	    }
	    output.flush();
	    output.close();
	}
	
	
	public static String[] readArray(String file) {
		//count lines in the file
		//create dirty array and copy elements in
		int counter = 0;
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				counter ++;
				s1.nextLine();
			}
			String[] dirtyArray = new String[counter];
			Scanner s2 = new Scanner(new File(file));
			for(int i = 0; i < counter; i++) {
				dirtyArray[i] = s2.nextLine();
			}
			return dirtyArray;
			
		}catch(FileNotFoundException e){
			
		}
		
		return null;
		
	}
	
	
}
