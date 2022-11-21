
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 345;
		int sum = 0;
		int r;
		int t=number;
		
		while(t!=0) {
			r = t%10;
			sum = sum + r;
			t=t/10;
		}
		
		System.out.println("The sum of digit : " + sum);
	}

}
