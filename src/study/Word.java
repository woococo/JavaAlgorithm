package study;

public class Word {
	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

	// i번째 글자가 모음인지 알려주는 메소드
	public boolean isVowel(int i) {
		boolean result = false;
		String vowel[] = { "a", "e", "i", "o", "u" };
		for (int j = 0; j < vowel.length; j++) {
			if (letters.substring(i, i + 1).equals(vowel[j])) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	public boolean isVowel2(int i) {
		return "aeiou".contains(letters.substring(i, i + 1));
	}
	
	public boolean isConsonant(int i) {
//		return !"aeiou".contains(letters.substring(i, i + 1));
		return !isVowel2(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word word = new Word("Hello World");
		System.out.println(word.isConsonant(0));
		System.out.println(word.isConsonant(1));
	}

}
