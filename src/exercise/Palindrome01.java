package exercise;

import java.util.Scanner;

/**
 * 判断是否是回文
 * 
 * @author blue
 *
 */
public class Palindrome01 {

	private void isPalindrome(char[] text) {
		int length = text.length;
		int num = length / 2;
		int tag = 0;
		for (int i = 0; i < num; i++) {
			if (text[i] == text[length - 1 - i]) {
				tag++;
			}
		}
		if (tag == num) {
			System.out.println("The string is palindrome!");
		} else {
			System.out.println("The string is not palindrome!");
		}
	}

	public static void main(String[] args) {
		Palindrome01 palindrome01 = new Palindrome01();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input palindrome string :");
		char[] text = scanner.nextLine().toCharArray();
		palindrome01.isPalindrome(text);
	}
}
