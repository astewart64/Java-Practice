
public class StringExercises {

	/**
	 * Aven Stewart
	 * 11/20/14
	 * 
	 */
	
	public static void main(String[] args) {
		vertical("Hello");
		reverse("hello");
		System.out.println();
		swapPairs("helloab");
		System.out.println();
		wordCount("Hello I am Aven");
	}
	public static void vertical(String word){
		int length = word.length();
		for (int i = 0;i<=(length - 1);i++){
			String wordChar = word.substring(i, i+1);
			System.out.println(wordChar);
		}
	}
	public static void reverse(String word){
		int length = word.length();
		for (int i = (length-1);i>=0;i--){
			String wordChar = word.substring(i, i+1);
			System.out.print(wordChar);
		}
	}
	public static void swapPairs(String word){
		int length = word.length();
		for ( int i = 0; i < length-1;i += 2) {
				String wordChar = (word.substring(i+1, i+2)) + (word.substring(i, i+1));
				System.out.print(wordChar);
		}
		if ((length % 2) != 0){
			System.out.print(word.charAt(length-1));
		}
		
	}
	public static void wordCount(String word){
		int wordcountVar = 0;
		for(char c : word.toCharArray()){
	        if (c == ' '){
	        	wordcountVar += 1;
	        }
		    else {
			    continue;
		    }
		}
		wordcountVar += 1;
		System.out.print(wordcountVar + " words in the string " + word );
	}
}
