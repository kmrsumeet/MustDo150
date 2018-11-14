import java.util.Scanner;

public class MaximumSumIncreasingSubsequence {

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
			int T[] = new int[n];
			for(int i=0;i<n;i++){
				T[i] = arr[i];
			}
			
			for(int i=1;i<n;i++){
				for(int j=0;j<i;j++){
					if(arr[j]< arr[i]){
						T[i] = Math.max(T[i], T[j] + arr[i]);
					}
				}
			}
			
			int maxSum =0;
			for(int i =0;i<n;i++){
				if(maxSum < T[i]){
					maxSum = T[i];
				}
			}
			
			System.out.println(maxSum);
			
			
		}
		


	}

}
