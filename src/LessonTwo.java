import java.util.Scanner;

public class LessonTwo {

	static Scanner userInput = new Scanner(System.in); 
	
	public static void main(String[] args) {
	
		System.out.print("Your favorite number: ");
		
		if(userInput.hasNextInt()) {
			int numberEntered = userInput.nextInt();
			
			System.out.println("You entered: " +numberEntered);
			
			int numberEnteredTimes2 = numberEntered * 2;
			System.out.println(numberEnteredTimes2);
			
			int numberEnteredSub2 = numberEntered - 2;
			System.out.println(numberEnteredSub2);
			
		}else {
			System.out.println("Enter an integere next time.");
		}
	}
}
