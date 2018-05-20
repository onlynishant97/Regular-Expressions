import java.util.regex.*;
import java.io.*;
/*
Regular expression to represent all 10 digit mobile numbers

Rules:-
Every number should contain exactly 10 digits
The first digit should be 7 or 8 or 9

Answers:-
[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
               or
[7-9][0-9]{9}
               or
[789][0-9]{9} 

If number contain 11 digits then 1st digit should be 0
0?[7-9][0-9]{9}

If number is 11 or 12 digits then
(0|91)?[7-9][0-9]{9}
 */
public class MobileNumberRegExp {
	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		while(true) {
			if(count==5)break;
			String number=b.readLine();
			Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
			Matcher m=p.matcher(number);
			if(m.matches())	System.out.println("Valid Number");
			else System.out.println("Not Valid");
			count++;
		}
	}
}
