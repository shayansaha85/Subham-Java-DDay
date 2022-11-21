
public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 85695;
		int count = 0;
		
		int temp = number;
		
		while(temp!=0) {
			count++; // 1, 2, 3, 4, 5
			temp = temp/10; // 8569, 856, 85, 8, 0
		}
		
		System.out.println("There are " + count + " digits in " + number);
	}

}
