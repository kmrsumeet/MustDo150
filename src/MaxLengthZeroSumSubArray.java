import java.util.HashMap;

public class MaxLengthZeroSumSubArray {
	
	public static int maxLength(int arr[]){
		HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();
		int sum = 0;
		int max_len = 0;
		for(int i = 0;i<arr.length;i++){
			sum = sum + arr[i];
			if(arr[i] == 0 && max_len == 0){
				max_len = 1;
			}
			if(sum == 0)
				max_len = i+1;
			Integer prev_i = hmap.get(sum);
			if(prev_i!=null){
				max_len = Math.max(max_len,i-prev_i);
			}
			else
				hmap.put(sum, i);
		}
		
		return max_len;
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
		int arr[] = {1,-1,1,-1,1,-1};
        System.out.println("Length of the longest 0 sum subarray is "
                           + maxLength(arr));

	}

}
