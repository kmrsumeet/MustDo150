import java.util.Scanner;

public class ArrayPairSumDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0){
			int n;
			n = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			int k;
			k = sc.nextInt();
			int sum = 0;
			for(int i =0;i<n;i++){
				sum = sum + (arr[i]%k);
			}
			if(sum%k == 0 && n%2!=1)
				System.out.println("True");
			else
				System.out.println("False");
		}

	}

}
