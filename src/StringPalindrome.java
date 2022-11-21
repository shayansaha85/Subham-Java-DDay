
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "wow";
		String reverse = "";
		
		int lin = name.length()-1;
		int fin = 0;
		for(int i=lin; i>=fin; i--) {
			reverse = reverse + Character.toString(name.charAt(i));
		}
		System.out.println(name.equals(reverse));
		if(name.equals(reverse)) {
			System.out.println("The string is palindrome");
		} else {
			System.out.println("The string is not palindrome");
		}
	}

}
