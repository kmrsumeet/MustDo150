import java.util.Scanner;

public class MaximumSubarray {

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
		    int ans = arr[0];
		    for(int i=1;i<n;i++){
		        ans = Math.max(ans,arr[i]);
		    }
		    if(ans < 0)
		        System.out.println(ans);
		    else
		    {
		  ans = 0;
		  int sum = 0;
		  for(int i = 0;i<n;i++)
		  {
		      if(sum + arr[i] > 0)
		        sum = sum + arr[i];
		       else
		       sum = 0;
		      ans = Math.max(ans,sum);
		       
		  }
		  System.out.println(ans);
		}
		}
	}

}

