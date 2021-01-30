package utility;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = "United State of America";
		StringBuffer sb = new StringBuffer();
		String[] word = s.split(" ");
		
		for(String words:word) {
			for(int i=words.length()-1;i>=0;i--) {
				char c = words.charAt(i);
				sb.append(c);
			}
			sb.append(" ");
		}
	
		System.out.println(sb.toString().trim());

		
	
	}

}
