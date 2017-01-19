package exercise;

import java.util.Scanner;

/**
 * 在一个字符串中找到第一个只出现一次的字符。如输入abaccdeff，则输出b。
 * 
 * @author blue
 *
 */
public class FirstSingleString {

	private void search(char[] text) {
		for (int i = 0; i < text.length; i++) {
			int tag = 0;
			for (int j = 0; j < text.length; j++) {
				if (text[i] == text[j]) {
					tag++;
				}
			}
			if (tag == 1) {
				System.out.println("The result is : " + text[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		FirstSingleString firstSingleString = new FirstSingleString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input string: ");
		char[] text = scanner.nextLine().toCharArray();
		firstSingleString.search(text);
	}

}