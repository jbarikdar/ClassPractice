package utility;

public class Palindrome {
	public static void main(String[] args) {
		String s = "123";
		String s1="";
		if(s ==" " || s.length()<2 || s.contains("[^a-zA-Z]+")){
			System.out.println("Not a valid entry");
		}else {
		for(int i=s.length()-1;i>=0;i--) {
			s1 = s1+s.charAt(i);
		}
		if(s.equals(s1)) {
			System.out.println("Word is palindrome");
		}else {
			System.out.println("Word is not palindrome");
		}
	
	}
	}


}
