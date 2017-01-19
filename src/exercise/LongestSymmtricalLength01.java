package exercise;

import java.util.Scanner;

public class LongestSymmtricalLength01 {
	int tag = 0;
	int index = 0;

	private void longestLength(char[] text, int index, int j, int tags) {
		if (tags == this.tag - 1 || index == text.length - 1) {
			System.out.println(this.tag);
		} else {
			for (int i = j; i < text.length; i++) {
				if (text[index] == text[i]) {
					tag = i;
				}
			}
			longestLength(text, index + 1, j + 1, this.tag);
		}

	}

	public static void main(String[] args) {
		LongestSymmtricalLength01 longestSymmtricalLength01 = new LongestSymmtricalLength01();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input string :");
		char[] text = scanner.nextLine().toCharArray();
		longestSymmtricalLength01.longestLength(text, 0, 1, 0);
	}

}
