import java.util.Scanner;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n;
			n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			int min1 = arr[0];
			int max1 = arr[0];
			int count1[] = new int[501];
			for(int i =0;i<n;i++){
				min1 = Math.min(arr[i], min1);
				max1 = Math.max(arr[i], max1);
				count1[arr[i]] = 1;
			}
			int maxLen = 0,c=0;
			for(int i = min1;i<=max1;i++){
				if(count1[i]!=1){
					c = 0;
				}
				else
				{
					c++;
					maxLen = Math.max(c, maxLen);
				}
			}
			System.out.println(maxLen);
		}

	}

}
