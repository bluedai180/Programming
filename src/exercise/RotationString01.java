package exercise;

import java.util.Scanner;

/**
 * 给定一个字符串，要求把字符串前面的若干个字符移动到字符串的尾部，如把字符串“abcdef”前面的2个字符'a'和'b'移动到字符串的尾部，
 * 使得原字符串变成字符串“cdefab”。
 * 
 * @author blue
 *
 */
public class RotationString01 {

	private void LeftShiftOne(char[] s) {
		char t = s[0];
		for (int i = 1; i < s.length; i++) {
			s[i - 1] = s[i];
		}
		s[s.length - 1] = t;
	}

	private char[] LeftRotateString(char[] s, int m) {
		while (m-- > 0) {
			this.LeftShiftOne(s);
		}
		return s;
	}

	public static void main(String[] args) {
		RotationString01 rotation = new RotationString01();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input string :");
		String text = sc.nextLine();
		char[] s = text.toCharArray();
		System.out.println("Please input the number for rotation :");
		int m = sc.nextInt();
		System.out.println("Rotation result is :");
		char[] t = rotation.LeftRotateString(s, m);
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i]);
		}
	}
}