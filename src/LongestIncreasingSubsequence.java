import java.util.Scanner;

public class LongestIncreasingSubsequence {

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
				T[i] = 1;
			}
			
			for(int i=1;i<n;i++){
				for(int j=0;j<i;j++){
					if(arr[j]< arr[i]){
						T[i] = Math.max(T[i], T[j] + 1);
					}
				}
			}
			int maxLength =0;
			for(int i =0;i<n;i++){
				if(maxLength < T[i]){
					maxLength = T[i];
				}
			}
			
			System.out.println(maxLength);
			
			
		}
		

	}

}
