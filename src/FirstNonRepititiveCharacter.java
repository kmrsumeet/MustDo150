import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepititiveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0){
			String str  = sc.next();
			char s1[] = str.toCharArray();
			HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
			int flag = 0;
			char ans = '$';
			for(int i = 0;i<str.length();i++){
				
				char c = str.charAt(i);
				Integer val = hmap.get(c);
				if(val!=null){
					flag = 1;
					
					ans = c;
					break;
				}
				else
					hmap.put(c,1);
			}
			if(flag == 1){
				System.out.println(ans);
			}
			else
				System.out.println("-1");
		}
	}

}
