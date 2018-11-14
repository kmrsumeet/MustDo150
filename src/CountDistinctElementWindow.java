import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctElementWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n,k;
			n = sc.nextInt();
			k = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0;i<n;i++){
				HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();
				int c = 0;
				if((k+i) > n)
					break;
				for(int j = i;j<(k+i);j++){
	
					Integer val = hmap.get(arr[j]);
					if(val!=null){
						hmap.put(arr[j],new Integer(val+1));
					}
					else
					{
						hmap.put(arr[j],1);
						c++;
					}
				}
				list.add(c);
				
			}
			Object[] objects = list.toArray();
			 
	        // Printing array of objects
	        for (Object obj : objects)
	            System.out.print(obj + " ");
			//System.out.println(list);
			
		}

	}

}
