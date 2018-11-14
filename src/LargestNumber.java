import java.util.*;
import java.lang.*;
import java.io.*;

class LargestNumber {
    
     public static String largestNumber(final int[] num) {
       if(num == null || num.length == 0){
            return " ";
        }
        String s_num[] = new String[num.length];
        for(int i = 0;i<num.length;i++){
            s_num[i] = String.valueOf(num[i]);
        }
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str2.compareTo(str1);
            }
        };
        Arrays.sort(s_num,comp);
        if(s_num[0].charAt(0) == '0')
            return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String s : s_num){
            sb.append(s);
        }
        
        return sb.toString();
    }
	public static void main (String[] args) {
		//code
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0){
		int n;
		n = sc.nextInt();
		int num[] = new int[n];
		for(int i = 0;i<n;i++){
		    num[i] = sc.nextInt();
		}
		
		String str = largestNumber(num);
		System.out.println(str);
	}
	}
}