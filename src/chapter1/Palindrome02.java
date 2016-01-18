package chapter1;

import java.util.Scanner;

/**
 * 输入字符串，输出回文样式。
 * 
 * @author blue
 *
 */
public class Palindrome02 {

	private void toPalindrome(char[] text, String str) {
		StringBuffer builder = new StringBuffer();
		char[] palindromeText = new char[text.length];

		for (int i = 0; i < text.length; i++) {
			palindromeText[i] = text[text.length - 1 - i];
			builder.append(palindromeText[i]);
		}
		System.out.print("The result is : " + str + builder.toString());
	}

	public static void main(String[] args) {
		Palindrome02 palindrome02 = new Palindrome02();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input palindrome string :");
		String str = scanner.nextLine();
		char[] text = str.toCharArray();
		palindrome02.toPalindrome(text, str);
	}

}
