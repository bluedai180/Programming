package chapter1;

import java.util.Scanner;

/**
 * 字符串的全排列 输入一个字符串，打印出该字符串中字符的所有排列。 
 * 例如输入字符串abc，则输出由字符a、b、c 所能排列出来的所有字符串
 * abc、acb、bac、bca、cab 和 cba。
 * 
 * @author blue
 *
 */
public class CalcAllPermutation01 {

	private void toPermutation(char[] text, int start, int end) {
		if (start == end) {
			for (int i = 0; i <= end; i++) {
				System.out.print(text[i]);
			}
			System.out.println();
		} else {
			for (int i = start; i <= end; i++) {
				char temp = text[start];
				text[start] = text[i];
				text[i] = temp;

				toPermutation(text, start + 1, end);

				temp = text[start];
				text[start] = text[i];
				text[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		CalcAllPermutation01 calcAllPermutation01 = new CalcAllPermutation01();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input palindrome string :");
		char[] text = scanner.nextLine().toCharArray();
		calcAllPermutation01.toPermutation(text, 0, text.length - 1);
	}

}
