import java.util.Scanner;

public class StrManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2;
		System.out.print("Enter any two strings:");
		Scanner scan = new Scanner(System.in);
		s1 = scan.next();
		s2 = scan.next();
		try {
			System.out.println("Concatenation of two strings: " + s1.concat(s2));
			System.out.println("Checking if s2 is present in s1: " + s1.contains(s2));
			System.out.println("Checking if s1 and s2 are equal: " + s1.equals(s2));
			System.out.println("Length of s1 and s2 are: " + s1.length() + " " + s2.length());
			System.out.println("Converting s1 and s2 to uppercase: " + s1.toUpperCase() + " " + s2.toUpperCase());
			System.out.println("Converting s1 and s2 to lowercase: " + s1.toLowerCase() + " " + s2.toLowerCase());
			System.out.println("Finding a substring of s1 and s2(from third character to last): " + s1.substring(3)
					+ " " + s2.substring(3));
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
