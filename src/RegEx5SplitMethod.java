import java.util.regex.*;
public class RegEx5SplitMethod {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\s");
		String[] s=p.split("Have a nice day");
		for(String obj:s) {
			System.out.println(obj);
		}
		System.out.println();
		p=Pattern.compile("a");
		s=p.split("Have a nice day");
		for(String obj:s) {
			System.out.println(obj);
		}
		System.out.println();
		p=Pattern.compile("\\.");
		s=p.split("www.abc.com");
		for(String obj:s) {
			System.out.println(obj);
		}
		System.out.println();
		p=Pattern.compile("[.]");
		s=p.split("www.abc.com");
		for(String obj:s) {
			System.out.println(obj);
		}
		System.out.println();
		p=Pattern.compile(".");
		s=p.split("www.abc.com");
		for(String obj:s) {
			System.out.println(obj); //no output because . means ever character so every char will be rejected
		}
	}
}
