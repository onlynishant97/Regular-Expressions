import java.util.regex.*;
import java.io.*;

/*
abc@gmail.com
1abc.2_c3@abc.xy.ci;
[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+
for gmail id
[a-zA-Z0-9][a-zA-Z0-9._]*@gmail[.]com
 */

public class EMailIdRegExp {
	public static void main(String[] args)throws Exception {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		while(true) {
			if(count==1)break;
			String number=b.readLine();
			Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@gmail[.]com");
			Matcher m=p.matcher(number);
			System.out.println(m.matches());	
			count++;
		}
	}
}
