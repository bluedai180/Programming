package chapter1;

import java.util.Scanner;

/**
 * 倒序输出字符串
 * 
 * @author blue
 *
 */
public class RotationString03 {

	private char[] LeftRotateString(char[] s) {
		char[] t = new char[s.length];
		for (int i = 0; i < s.length; i++) {
			char q = s[s.length - 1 - i];
			t[i] = q;
		}
		return t;
	}

	public static void main(String[] args) {
		RotationString03 rotation = new RotationString03();
		Scanner sc = new Scanner(System.in);

		System.out.println("Please input string :");
		String text = sc.nextLine();
		System.out.println("Rotation result is :");
		if (text != null) {
			char[] s = text.toCharArray();
			char[] a = rotation.LeftRotateString(s);
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
		}
	}
}