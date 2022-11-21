import java.util.Scanner;

public class CamelCase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = (new Scanner(System.in).nextLine());
		String output = "";
		// str.split(" ") --> ["Hello", "how", "are", "you?"]
		int l = str.split(" ").length;
		for(int i=0; i<l; i++) {
			output = output + str.split(" ")[i].substring(0,1).toUpperCase() + str.split(" ")[i].substring(1).toLowerCase();
		}
		
		System.out.println(output);
		
	}

}
