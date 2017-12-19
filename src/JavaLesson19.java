import java.util.regex.*;

public class JavaLesson19 {
	
	public static void main (String[] args) {
		
		String longString = " Denise Pereira BC V6K1V7 CA (778)960-3515 343.962.268-10 ";
		String strangerString = " 1Z aaa **** *** {{{ {{ { ";
		
		//[A-Z] - Any characters you want to look for
		//[^]
		//[\\s]
		
		//Word that is 2 to 20 characters in length
		//[A-Za-z]{2,20}
		// \\w{2,20}
		
		//regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
		//regexChecker("\\s[A-Z0-9]{6}\\s", longString);
		
		regexChecker("B[C]", longString);
	}
	
	public static void regexChecker(String regex, String str2Ckc) {
		Pattern checkRegex = Pattern.compile(regex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Ckc);
		
		while(regexMatcher.find()) {
			if (regexMatcher.group().length() !=0) {
				System.out.println(regexMatcher.group().trim());
			} 
			System.out.println("Start index: "+ regexMatcher.start());
			System.out.println("End index: "+ regexMatcher.end());
		}
	}

}
