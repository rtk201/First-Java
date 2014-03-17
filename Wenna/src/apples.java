import java.util.Scanner;

class apples{
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			salmon salmonObject = new salmon ();
			System.out.println("Enter name of first gf here: ");
			String temp = input.nextLine();
			salmonObject.setName(temp);
			salmonObject.saying();		
	}
}

