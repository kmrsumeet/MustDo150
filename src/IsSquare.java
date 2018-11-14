
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class IsSquare {
    
    static boolean validSquare(int p1[],int p2[],int p3[],int p4[])
    {
        long lengths[] = {dist(p1,p2),dist(p2,p3),dist(p3,p4),dist(p4,p1),dist(p1,p3),dist(p2,p4)};
        long max1 = 0, nonMax = 0;
        for(long len : lengths)
            max1 = Math.max(max1,len);
        
        int count1 = 0;
        
        for(int i = 0;i<lengths.length;i++){
            if(lengths[i] == max1){
                count1++;
            }
            else
            nonMax = lengths[i];
        }
        if(count1!=2)
            return false;
        
        for(long len : lengths)
        {
            if(len!=max1 && len!=nonMax)
                return false;
        }
        return true;
    }
    
    static long dist(int p1[],int p2[]){
        return (long)Math.pow(p1[0]-p2[0],2) + (long)Math.pow(p1[1]-p2[1],2);
    }
	public static void main (String[] args) {
		//code
		int t;
		Scanner sc = new Scanner(System.in);
		 t = sc.nextInt();
		while(t-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int p1[] = new int[2];
		    p1[0] = a;
		    p1[1] = b;
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int p2[] = new int[2];
		    p2[0] = c;
		    p2[1] = d;
		    int e = sc.nextInt();
		    int f = sc.nextInt();
		    int p3[] = new int[2];
		    p3[0] = e;
		    p3[1] = f;
		    int g = sc.nextInt();
		    int h = sc.nextInt();
		    int p4[] = new int[2];
		    p4[0] = g;
		    p4[1] = h;
		    
		    boolean bool = validSquare(p1,p2,p3,p4);
		    if(bool == true)
		        System.out.println("Yes");
		  else
		  System.out.println("No");
		    
		}
	}
}