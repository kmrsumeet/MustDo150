import java.util.HashMap;
import java.util.Scanner;

public class ZeroSumSubArrays {

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
			HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
			int sum = 0;
			int count1 = 0;
			for(int i = 0;i<n;i++){
				sum = sum + arr[i];
				if(arr[i]==0 || sum == 0){
					count1++;
				}
			
					
				Integer prev_i = hmap.get(sum);
				if(prev_i!=null){
					count1++;
				}
				else
					hmap.put(sum,i);
			}
			
			System.out.println(count1);
		}
	}

}
