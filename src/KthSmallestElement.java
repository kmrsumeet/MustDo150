import java.lang.*;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.*;
class KthSmallestElement
 {
	public static void main (String[] args) throws Exception{
	   // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    Scanner sc = new Scanner(System.in);
	    int tst = sc.nextInt();//Integer.parseInt(br.readLine());
	    while(tst-->0) {
	        int n = sc.nextInt();//Integer.parseInt(br.readLine());
	        //args = br.readLine().split(" ");
	        PriorityQueue<Integer> pq = new PriorityQueue<>();
	        for(int i=0;i<n;i++) {
	            int tmp = sc.nextInt();//Integer.parseInt(args[i]);
	            pq.add(tmp);
	        }
	        int k = sc.nextInt();//Integer.parseInt(br.readLine());
	        while(k-->1) {
	            pq.poll();
	        }
	        System.out.println(pq.peek());
	    }
    }
}