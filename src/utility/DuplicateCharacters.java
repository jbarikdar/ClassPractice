package utility;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String s = "united state of america";
		s = s.replace(" " , "");
		char[] letter = s.toCharArray();
		for(int i=0;i<=letter.length;i++) {
			for(int j=i+1;j<letter.length;j++) {
				if(letter[i] == letter[j]) {
					System.out.println(letter[i]+" is duplicate");
					break;
				}
			}
		}

	}

}
