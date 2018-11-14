import java.util.HashSet;
import java.util.Scanner;

public class ArraySubsetOfAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0){
			int n,m;
			n = sc.nextInt();
			m = sc.nextInt();
			int arr1[] = new int[n];
			int arr2[] = new int[m];
			int max1 = 0, max2 = 0;
			for(int i = 0;i<n;i++){
				arr1[i] = sc.nextInt();
				
			}
			for(int i = 0;i<m;i++){
				arr2[i] = sc.nextInt();
			}
			HashSet<Integer> hset= new HashSet<>();
	         
	        for(int i = 0; i < n; i++)
	        {
	            if(!hset.contains(arr1[i]))
	                hset.add(arr1[i]);
	        }
	        int flag = 0;
	        for(int i = 0; i < m; i++)
	        {
	            if(!hset.contains(arr2[i]))
	                flag = 1;
	        }
			
			if(flag == 1){
				System.out.println("No");
			}
			else
				System.out.println("Yes");
		}

	}

}
