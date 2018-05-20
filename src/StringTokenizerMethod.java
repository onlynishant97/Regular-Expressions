import java.util.*;
public class StringTokenizerMethod {
	public static void main(String[] args) {
	     StringTokenizer st = new StringTokenizer("this is a test");
	     while(st.hasMoreTokens()) {
	    	 System.out.println(st.nextToken());
	     }
	     System.out.println();
	     st = new StringTokenizer("08-02-2018","-");
	     while(st.hasMoreTokens()) {
	    	 System.out.println(st.nextToken());
	     }
	}
}
