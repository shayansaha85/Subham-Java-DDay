
public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * true && true : true
		 * true && false : false
		 * false && false : false
		 * 
		 * true || true : true
		 * true || false : true
		 * false || false : false
		 */
		
		
		String name = "Subham";

		int count = 0;
		for(int i=0; i<name.length(); i++) {
			
//			if(name.charAt(i) == 'a' || name.charAt(i) == 'A' || name.charAt(i) == 'e' || name.charAt(i) == 'E'  || name.charAt(i) == 'i'  || name.charAt(i) == 'I' || name.charAt(i) == 'o' ||name.charAt(i) == 'O' || name.charAt(i) == 'u' || name.charAt(i) == 'U') {
//				count++;
//			}
			
			
//			if(Character.toString(name.charAt(i)).toLowerCase().equals("a") ||  Character.toString(name.charAt(i)).toLowerCase().equals("e") || Character.toString(name.charAt(i)).toLowerCase().equals("i") || Character.toString(name.charAt(i)).toLowerCase().equals("o") || Character.toString(name.charAt(i)).toLowerCase().equals("u")) {
//				count++;
//				
//			}
			
			if(Character.toString(name.charAt(i)).equalsIgnoreCase("a") ||  Character.toString(name.charAt(i)).equalsIgnoreCase("e") || Character.toString(name.charAt(i)).equalsIgnoreCase("i") || Character.toString(name.charAt(i)).equalsIgnoreCase("o") || Character.toString(name.charAt(i)).equalsIgnoreCase("u")) {
				count++;
				
			}
		}
		
		System.out.println("There are " + count + " vowels in the string");
	}

}
