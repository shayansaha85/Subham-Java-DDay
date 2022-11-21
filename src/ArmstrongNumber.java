
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 371;
		int digits = 0;
		
		
		// generating the power
		int t = number;
		while(t!=0) {
			digits++;
			t=t/10;
		}
		
		int armstrong = 0, r;
		int t2 = number;
		while(t2!=0) {
			r = t2%10;
			armstrong += Math.pow(r, digits);
			t2 = t2/10;
		}
		
		if(armstrong == number) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not armstrong");
		}
	}

}
