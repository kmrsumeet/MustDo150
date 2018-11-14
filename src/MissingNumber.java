import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- >0)
		{
			int n;
			n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n-1;i++){
				arr[i] = sc.nextInt();
			}
			int x = findMissingNo(arr,n-1);
			System.out.println(x);
		}
			

	}

	private static int findMissingNo(int[] arr, int n) {
		// TODO Auto-generated method stub
		int x1 = arr[0];
		int x2 = 1;
		for(int i=1;i<n;i++)
			x1 = x1^arr[i];
		
		for(int i=2;i<=n+1;i++){
			x2 = x2^i;
		}
		int x = x1^x2;
		return x;
	}

}
