
public class PrimeList {

	public static boolean isPrime(int n) {
		int count = 0;
		if(n == 0 || n == 1) {
			return false;
		} else {
			for(int i=2; i<=n/2; i++) {
				if(n%i == 0) {
					count++;
				}
			}
			if(count==0) {
				return true;
			} else {
				return false;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ini = 2;
		int fin = 100;
		
		for(int i=ini; i<=fin; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
