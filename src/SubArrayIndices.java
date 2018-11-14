import java.util.HashMap;
import java.util.Scanner;

public class SubArrayIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while(t-- > 0){
			int n,k;
			n = sc.nextInt();
			k = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++)
				arr[i] = sc.nextInt();
			HashMap<Integer, Integer> hmap = new HashMap<>();
			int sum = 0;
			for(int i = 0;i<n;i++){
				sum = sum + arr[i];
				hmap.put(i, sum);
			}
			int start = 0;
			int flag = 0,curr_sum = 0;
			int val;
			for(int i = 0;i<n;i++){
				
				if(curr_sum > 0){
				val = hmap.get(i) - curr_sum;
				}
				else
				{
					val = hmap.get(i);
				}
				
				if(val> k){
					start++;
					curr_sum = hmap.get(i-1);
					//curr_sum = val;
				}
				if(val == k){
					System.out.println((start+1) + " " + (i+1));
					flag = 1;
					break;
				}
				//val = val - curr_sum;
				
				
				
			}
			if(flag == 0)
				System.out.println("-1");
		}

	}

}
