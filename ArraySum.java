import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[10],n,sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=scan.nextInt();
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++){
			ar[i]=scan.nextInt();	
		}
		
		for(int i:ar){
			sum+=ar[i];
		}
		System.out.println("Sum of array: "+sum);
	}

}
