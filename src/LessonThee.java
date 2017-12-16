
public class LessonThee {

	public static void main (String a[]) {
		int randomNum = (int) (Math.random() * 50);
		
		if(randomNum < 25) {
			System.out.println("The random number is less than 25");
		} else if(randomNum > 40) {
			System.out.println("The random number is greater than 40");
		}else if (randomNum == 18) {
			System.out.println("The random number is 18");
		}
		System.out.println("The random number is "+ randomNum);
	}
}
