import java.util.Scanner;

class apples{
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			salmon salmonObject = new salmon ();
			
			System.out.println("Enter your name here");
			String name = input.nextLine();
			
			salmonObject.simpleMessage(name);
					
	}
}

