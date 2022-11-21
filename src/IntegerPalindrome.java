
public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 9807
		 * r (number%10)*10 >+
		 */
		
		int number = 9807;
		int temp = number;
		int remainder = 0;
		int reverse = 0;
		
		while(temp!=0) {
			remainder = temp%10; // 7, 0, 8, 9
			reverse = reverse*10+remainder; // 7, 70, 708, 7089
			temp = temp/10; // 980, 98, 9, 0
		}
		
		System.out.println("Reverse : " + reverse);
		System.out.println("Temp variable : " + temp);
		
		if(reverse == number) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

}
