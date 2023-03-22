import java.util.Scanner;
public class ArraySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[20];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n = scan.nextInt();
		System.out.println("Enter the array of integers:");
		for(int i=0;i<n;i++) {
			ar[i] = scan.nextInt();
		}
		System.out.print("Enter an element to search:");
		int s = scan.nextInt();
		System.out.println("Element found at location: ");
		for(int i=0;i<n;i++) {
			if(s==ar[i])
				System.out.print(i+1+" ");
		}
	}

}
