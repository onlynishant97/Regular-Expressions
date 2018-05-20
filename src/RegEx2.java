import java.util.regex.*;

/*
[abc] either a or b or c
[^abc] except a,b and c
[a-z] any lower case alphabets
[A-Z] any upper case alphabets
[a-zA-Z] any alphabet sybmol
[0-9] any digit from 0 to 9
[a-zA-Z0-9] any alphanumeric character
[^a-zA-Z0-9] except alphanumeric i.e special characters	

*/

public class RegEx2 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("[abc]");
		Matcher m=p.matcher("a7b@z#9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("[^abc]");
		m=p.matcher("a7b@z#9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("[a-z]");
		m=p.matcher("a7b@z#9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("[0-9]");
		m=p.matcher("a7b@z#9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("[a-zA-Z0-9]");
		m=p.matcher("a7b@z#9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("[^a-zA-Z0-9]");
		m=p.matcher("a7b@z#9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}
}
