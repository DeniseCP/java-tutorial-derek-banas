import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Lesson18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addThreadToPool();

	}

	public static void addThreadToPool() {
		ScheduledThreadPoolExecutor eventPool = 
				new ScheduledThreadPoolExecutor(5);
		
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerfomSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerfomSystemCheck("Calendar"), 1, 5, TimeUnit.SECONDS);
		
		System.out.println("Number of Threads: "+ Thread.activeCount());
	
		Thread[] listOfThreads = new Thread[Thread.activeCount()];
		
		Thread.enumerate(listOfThreads);
		
		for (Thread i : listOfThreads) {
			System.out.println(i.getName());
		}
		
		for (Thread i : listOfThreads) {
			System.out.println(i.getPriority());
		}
		
		eventPool.shutdown();
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
