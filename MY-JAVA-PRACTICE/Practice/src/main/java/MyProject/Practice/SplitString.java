package MyProject.Practice;

public class SplitString {
	public static void main(String[] args) {
		String sentence="My Name is Ananya";
		String[] words = sentence.split(" ");
		
		for(String word : words) {
			System.out.println(word);
		}
	}

}
