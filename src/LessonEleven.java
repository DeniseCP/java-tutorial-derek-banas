import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class LessonEleven {

	public static void main( String[] args) {
		
		ArrayList arrayListOne;
		
		arrayListOne = new ArrayList();
		
		ArrayList arrayListTwo = new ArrayList();
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("John Smith");
		names.add("Sarah Connor");
		names.add("Bob Loblaw");
		
		names.add(2, "Mike Wazoski");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		names.set(0, "Michael Scott");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
	}
}
