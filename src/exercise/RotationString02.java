package exercise;

import java.util.Scanner;

/**
 * 旋转字符串，时间复杂度为 O(n)，空间复杂度为 O(1)。
 * 
 * @author blue
 *
 */
public class RotationString02 {

	private void ReverseString(char[] s, int from, int to) {
		while (from < to) {
			char t = s[from];
			s[from++] = s[to];
			s[to--] = t;
		}
	}

	private char[] LeftRotateString(char[] s, int m) {
		ReverseString(s, 0, m - 1);
		ReverseString(s, m, s.length - 1);
		ReverseString(s, 0, s.length - 1);
		return s;
	}

	public static void main(String[] args) {
		RotationString02 rotation = new RotationString02();
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