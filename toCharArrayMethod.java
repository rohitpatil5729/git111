package ArrayDetails;

import java.util.Arrays;

public class toCharArrayMethod {
	//toCharArray() METHOD is used to convert string to an array
	
	public static void main(String[] args) {
		String a1="Rohit Patil";
		char[] c1=a1.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println((c1[3]));
		//System.out.println(Arrays.toString(c1[2]));//this is not possible becoz Arrays.toString method is not for char
	
	String r="softwaretestingbymkt";
	char[] r1= r.toCharArray();
	System.out.println(Arrays.toString(r1));
	
	
	}

}
