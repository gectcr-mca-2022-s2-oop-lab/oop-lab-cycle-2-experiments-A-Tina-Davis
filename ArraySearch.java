import java.util.Scanner;
public class ArraySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0,i;
		int ar[] = new int[20];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n = scan.nextInt();
		System.out.println("Enter the array of integers:");
		for(i=0;i<n;i++) {
			ar[i] = scan.nextInt();
		}
		System.out.print("Enter an element to search:");
		int s = scan.nextInt();
		for(i=0;i<n;i++) {
			if(s==ar[i]) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Element found at location: "+(i+1));
		}
		else {
			System.out.println("Element not found!!! ");
		}
	}

}
