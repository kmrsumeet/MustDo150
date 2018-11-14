import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ReverseGroups {
	
	public static ArrayList<Integer> reverseList(int arr[],int n,int k){
		int j = 0;
		Stack<Integer> s = new Stack<Integer>();
		for(int i = j;i<(j+k);i++){
			s.push(arr[i]);
			j++;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(s.pop());
		
		return list;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0){
			int n;
			n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			
			ArrayList<Integer> list = reverseList(arr, n, k);
			
			for(int i=0;i<n;i++){
				System.out.print(list.get(i));
			}
			
			System.out.println();
			
		}

	}

}
