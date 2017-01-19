package exercise;

import java.util.Scanner;

/**
 * 字符串包含
 * 
 * @author blue
 *
 */
public class ContantString01 {

	private void searchString(char[] text, char[] contantString) {
		int tag = 0;
		for (int i = 0; i < contantString.length; i++) {
			for (int j = 0; j < text.length; j++) {
				if (text[j] == contantString[i]) {
					tag++;
				}
			}
		}
		this.isContant(tag, contantString.length);
	}

	private void isContant(int tag, int length) {
		if (tag == length) {
			System.out.print("The result is True!");
		} else {
			System.out.print("The result is False!");
		}
	}

	public static void main(String[] args) {
		ContantString01 contant = new ContantString01();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input string :");
		char[] text = sc.nextLine().toCharArray();
		System.out.println("Search string:");
		char[] contantString = sc.nextLine().toCharArray();
		contant.searchString(text, contantString);
	}
}