import java.util.regex.*;
public class RegExDeomo {
	public static void main(String[] args) {
		int count=0;
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abababaabbab");
		while(m.find()) {
			count++;
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println(count);
	}
}
