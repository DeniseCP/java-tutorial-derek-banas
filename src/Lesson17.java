
public class Lesson17 {
	
	public static void main(String[] args) {
		
		Thread getTime = new GetTime20();
		Runnable getMail = new GetMail(10);
		
		Runnable getMailToo = new GetMail(20);
		
		getTime.start();
		new Thread(getMail).start();
		new Thread(getMailToo).start();
	}

}
