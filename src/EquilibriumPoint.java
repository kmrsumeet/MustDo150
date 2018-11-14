import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		
		while(t-- > 0){
			int n;
			n = sc.nextInt();
			int arr[] = new int[n];
			int sumLeft = 0;
			int sumRight = 0;
			int ans = 0;
			int flag = 0;
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			if(n==1){
				System.out.println(n);
				flag = 1;;
			}
			else
			{
				for(int i=0;i<n;i++){
					int mid = i;
					sumLeft =0;sumRight = 0;
					if(mid > 0){
					for(int j =0;j<mid;j++){
						sumLeft = sumLeft + arr[j];
					}
					
					for(int k = mid+1;k<n;k++){
						sumRight = sumRight + arr[k];
					}
					
					if(sumLeft == sumRight){
						ans = mid + 1;
						flag =1;
						break;
					}
					}
					
				}
				if(flag == 1)
					System.out.println(ans);
					else
					System.out.println("-1");
			}
			
			
			
		}

	}

}
