import java.util.regex.*;

/*
Quantifiers:-
a exactly one a
a+ atleast 1 a
a* 0 or more a
a? 0 or 1 a
 */

public class RegEx4 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("a");
		Matcher m=p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("a+");
		m=p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("a*");
		m=p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("a?");
		m=p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}
}
