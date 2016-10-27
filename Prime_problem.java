package song;
import java.util.*;

public class Prime_problem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, count;//count는 약수가 몇개인지 
		ArrayList<Integer> Primes = new ArrayList<Integer>(); 
		System.out.print("Input N : ");
		
		N = s.nextInt(); 
	
		// TODO #2 소수 검사 알고리즘
		for(int i=2; i<N+1;i++) {
			count = 0;
			
			
			for(int k=1;k<i;k++) {
				if(i%k==0) {
					count++;
				}
			}
			if(count==1) {
				Primes.add(i);// 소수면 Primes에 저장
				
			}
		}
		for(int i = 0; i < Primes.size(); i++) {
			System.out.print(Primes.get(i)+" "); 
		}
	}
}

