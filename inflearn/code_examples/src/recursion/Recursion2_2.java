package recursion;

public class Recursion2_2 {
	public static void main(String[] args) {
		
	}
	
	public static void printChars(String str) {
		if(str.length() == 0) return;
		else {
			System.out.println(str.charAt(0));
			printChars(str.substring(1));
		}
	}
}
