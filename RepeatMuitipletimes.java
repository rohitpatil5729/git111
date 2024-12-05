package ArrayDetails;

import java.util.Arrays;

public class RepeatMuitipletimes {
	
	public static void main(String[] args) {
		String s1="Rohit Patil123@";
		char[]a4=s1.toCharArray();
		System.out.println(Arrays.toString(a4));
		Arrays.sort(a4);
		System.out.println(Arrays.toString(a4));
		System.out.println(s1.repeat(3) );
		//System.out.println(s1.split());
		String[]s3=s1.split("");
		System.out.println(Arrays.toString(s3));
		String[] s4=s1.split("", 5);
		System.out.println(Arrays.toString(s4));
	
}
}
