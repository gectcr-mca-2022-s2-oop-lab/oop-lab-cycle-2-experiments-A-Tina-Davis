import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int i, j, n;
		String temp;
		String ar[] = new String[20];
		Scanner scan = new Scanner(System.in);
		System.out.print("How many names you have to sort:");
		n = scan.nextInt();
		System.out.print("Enter the names:");
		for (i = 0; i < n; i++) {
			ar[i] = scan.next();
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if ((ar[j].compareTo(ar[j + 1])) > 0) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		System.out.print("Sorted array: ");
		for (i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
