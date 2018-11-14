import java.util.Scanner;

public class PairWithGivenSumFromTwoArray {

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
			for(int i = 0 ;i<n;i++){
				arr1[i] = sc.nextInt();				
			}
			for(int i = 0;i<m;i++){
				arr2[i] = sc.nextInt();
			}
			int x = sc.nextInt();
			for(int i = 0;i<n;i++){
				for(int j = 0;j<m;j++){
					if(arr1[i] + arr2[j] == x){
						System.out.println(arr1[i] + " " + arr2[j]);
					}
				}
				
			}
		
		}
		

	}

}
