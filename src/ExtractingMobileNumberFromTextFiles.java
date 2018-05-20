import java.util.regex.*;
import java.io.*;
public class ExtractingMobileNumberFromTextFiles {
	public static void main(String[] args)throws Exception {
		PrintWriter out=new PrintWriter("MobileNumbers.txt");
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		BufferedReader b=new BufferedReader(new FileReader("C:\\Users\\rajes\\eclipse-workspace\\Regular Expression\\src\\test.txt"));
		String line=b.readLine();
		while(line!=null) {
			Matcher m=p.matcher(line);
			while(m.find()) {
				out.println(m.group());
			}
			line=b.readLine();
		}
		out.flush();
	}
}
