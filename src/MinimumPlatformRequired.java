import java.io.*;
import java.util.*;

public class MinimumPlatformRequired {

    static int findPlatformsRequiredForStation(int arr[], int dep[], int n)
    {
        int platform_needed = 0, maxPlatforms = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
 
        // Similar to merge in merge sort
        while (i < n && j < n)
        {
            if (arr[i] < dep[j])
            {
                platform_needed++;
                i++;
                if (platform_needed > maxPlatforms) 
                    maxPlatforms = platform_needed;
            }
            else 
            {
                platform_needed--;
                j++;
            }
        }
        return maxPlatforms;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int dep[] = new int[n];
        int j = 0;
        int t = n;
        while(t-- > 0){
            int arrivalTime = sc.nextInt();
            int depTime = sc.nextInt();
            arr[j] = arrivalTime;
            dep[j] = depTime;
            j++;
        }
        int ans = findPlatformsRequiredForStation(arr,dep,n);
        System.out.println(ans);
    } 
}