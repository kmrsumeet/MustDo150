import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSubarraysSizek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0)
		{
			int n;
			n = sc.nextInt();
			int k;
			k = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				int max1 = arr[i];
				if((i+k) <= n){
				for(int j=i;j<i+k;j++){
					if(max1 < arr[j]){
						max1 = arr[j];
					}
					
				}
				list.add(max1);
				
			}
			}
			for(int i =0;i<list.size();i++){
				System.out.print(list.get(i) + " ");
			}
			System.out.println();
		}

	}

}
