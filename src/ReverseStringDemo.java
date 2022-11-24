
public class ReverseStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Agartala";
		String rev_string = "";
		
//		for(int i = arr.length-1; i>=0; i--) {
//			
//		}
		
		int i = name.length()-1;
		
		while(i>=0) {
			rev_string = rev_string + Character.toString(name.charAt(i));
			i--;
		}
		
		System.out.println("Reversed string : " + rev_string);
		
		
	}

}
