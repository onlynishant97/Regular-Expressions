
public class StringSplitMethod {
	public static void main(String[] args) {
		String s="Have a nice day";
		String[] ob=s.split("\\s");
		for(String obj:ob) System.out.println(obj);
	}
}
