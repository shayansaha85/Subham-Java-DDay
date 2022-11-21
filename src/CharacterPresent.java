import java.util.Scanner;

public class CharacterPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String name = "coconut";
		 * Char ch = 'c';
		 * int count = 0;
		 * for(0 -> length):
		 * name[i] == ch -> count++
		 * 
		 * count !=0 : count, "Character absent"
		 */
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		char ch = sc.next().charAt(0);
		int count = 0;
		for(int i=0 ;i<name.length(); i++) {
			if(name.charAt(i) == ch) {
				count++;
			}
		}
		
		if(count!=0) {
			System.out.println(count);
		} else {
			System.out.println("Character absent");
		}
	}

}
