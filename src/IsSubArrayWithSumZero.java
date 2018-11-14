import java.util.HashMap;

public class IsSubArrayWithSumZero {
	
	static boolean subArrayExists(int arr[],int n){
		HashMap<Integer, Integer> sumMap = new HashMap<Integer,Integer>();
		int sum = 0;
		for(int i = 0;i<n;i++){
			sum = sum + arr[i];
			if(sum == 0 || arr[i] == 0 || sumMap.get(sum)!=null){
				return true;
			}
			sumMap.put(sum, i);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,-2,-2,5,-4,3};
		boolean ans = subArrayExists(arr,7);
		System.out.println(ans);

	}

}
