import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int j=n;
		int arr[] = new int[n];
		for(int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		while(j!=0) {
			System.out.println(arr[j-1]);
			j--;
		}
	}
}
