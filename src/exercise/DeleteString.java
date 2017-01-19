package exercise;

import java.util.Scanner;

/**
 * 在字符串中删除特定的字符 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。 例如，输入”They are
 * students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”。
 * 
 * @author blue
 *
 */
public class DeleteString {
	int temp = 0;

	private void toTurn(char[] text, char[] deleText) {
		int tag = 0;
		int j = 0;
		int length = deleText.length;
		int textLength = text.length;
		this.toDelete(text, j, length, textLength, tag, deleText);
	}

	private void toDelete(char[] text, int j, int length, int textLength, int tag, char[] deleText) {
		StringBuilder builder = new StringBuilder();
		if (tag == length) {
			if (text.length == textLength) {
				temp++;
			} else {
				System.out.print(new String(text) + " ");
			}
		} else {
			for (int i = 0; i < text.length; i++) {
				if (text[i] != deleText[j]) {
					builder.append(text[i]);
				}
			}
			toDelete(builder.toString().toCharArray(), j + 1, length, textLength, tag + 1, deleText);
		}
	}

	public static void main(String[] args) {
		DeleteString deleteString = new DeleteString();
		Scanner scanner = new Scanner(System.in);
		Scanner scannerDele = new Scanner(System.in);
		System.out.println("Please input string :");
		String[] strings = scanner.nextLine().split(" ");
		System.out.println("Please input delete string: ");
		char[] deleText = scannerDele.nextLine().toCharArray();
		System.out.println("The result is : ");
		for (int i = 0; i < strings.length; i++) {
			char[] text = strings[i].toCharArray();
			deleteString.toTurn(text, deleText);
		}
		if (deleteString.temp == strings.length) {
			System.out.println("There is no mapping string!");
		}
	}
}
