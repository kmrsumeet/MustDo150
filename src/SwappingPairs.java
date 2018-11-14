import java.util.Scanner;

public class SwappingPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0){
			int n,m;
			n = sc.nextInt();
			m = sc.nextInt();
			int arrN[] = new int[n];
			int arrM[] = new int[m];
			int sumN = 0, sumM = 0;
			for(int i = 0;i<n;i++){
				arrN[i] = sc.nextInt(); 
				sumN = sumN + arrN[i];
			}
			for(int i = 0;i<m;i++){
				arrM[i] = sc.nextInt();
				sumM = sumM + arrM[i];
			}
			int diff;
			if(sumM < sumN){
				diff = (sumN - sumM)/2;
			}
			else{
				diff = (sumM - sumN)/2;
			}
			int l =0;
			if(m<n){
				l = m;
			}
			else
				l = n;
			int flag = 0;
			for(int i = 0;i<l;i++){
				if((arrM[i] == (diff + arrN[i])) || (arrN[i] == (diff + arrM[i]))){
					flag = 1;
					break;
				}
			}
			if(flag == 1){
				System.out.println("1");
			}
			else
				System.out.println("0");
			}
		}

	}
