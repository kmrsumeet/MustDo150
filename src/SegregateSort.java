import java.util.Scanner;

public class SegregateSort {

	 public static int[] swap(int arr[],int x,int y){
		
	        int temp = arr[x];
	        arr[x] = arr[y];
	        arr[y] = temp;
	        return arr;
	    } 
		public static void main (String[] args) {
			//code
			int t;
			Scanner sc = new Scanner(System.in);
			t = sc.nextInt();
			while(t-- > 0)
			{
			    int n;
			    n = sc.nextInt();
			    int arr[] = new int[n];
			    for(int i=0;i<n;i++){
			        arr[i] = sc.nextInt();
			    }
			    int i=0,j=0,k=n-1;
			    while(j<=k){
			        if(arr[j] == 0){
			        	arr = swap(arr,i,j);
			            i++;
			            j++;
			        }
			        else if(arr[j] == 1){
			            j++;
			        }
			        else
			        {
			        	arr = swap(arr,j, k);
			            k--;
			        }
			    }
			    for(int l=0;l<n;l++){
			    System.out.print(arr[l] + " ");
			    }
			    System.out.println();
			    
			}
		}
}


