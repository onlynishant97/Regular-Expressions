import java.util.regex.*;
/*
\s space character
\S except space character (any character)
\d any digit
\D except digit any character
\w any word character[a-zA-Z0-9]
\W except word charcter (special character)
. any character
 */
public class RegEx3 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\s");
		Matcher m=p.matcher("a7b k@9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("\\S");
	    m=p.matcher("a7b k@9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("\\d");
	    m=p.matcher("a7b k@9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("\\D");
	    m=p.matcher("a7b k@9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("\\w");
	    m=p.matcher("a7b k@9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile("\\W");
	    m=p.matcher("a7b k@9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println();
		p=Pattern.compile(".");
	    m=p.matcher("a7b k@9");
		while(m.find()) {
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}
}
