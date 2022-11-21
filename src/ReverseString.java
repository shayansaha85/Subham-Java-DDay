
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String name = "Subham";
		 * output --> mahbuS
		 * 
		 * Strategy:
		 * last element index = length of name - 1
		 * first element index = 0
		 * String reverse = "";
		 * for loop :  reverse : last element index -> first element
		 * reverse += iterator
		 */
		
		String name = "Subham";
		String reverse = "";
		
		int lin = name.length()-1;
		int fin = 0;
		for(int i=lin; i>=fin; i--) {
			reverse = reverse + Character.toString(name.charAt(i));
		}
		
		System.out.println(reverse);
	}

}
