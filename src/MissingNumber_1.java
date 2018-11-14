/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class MissingNumber_1 {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n;
		    n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0;i<n-1;i++){
		        arr[i] = sc.nextInt();
		    }
		    int actualSum = (n*(n+1))/2;
		    int s = 0;
		    for(int i = 0;i<n-1;i++){
		        s = s + arr[i];
		    }
		    int missingNo = actualSum - s;
		    System.out.println(missingNo);
		}
	}
}