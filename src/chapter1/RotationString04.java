
package chapter1;

import java.util.Scanner;

/**
 * 单词翻转。输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变，句子中单词以空格符隔开。为简单起见，标点符号和普通字母一样处理。例如，输入“I
 * am a student.”，则输出“student. a am I”。
 * 
 * @author blue
 *
 */
public class RotationString04 {

	private void textSplit(String tStrings) {
		if (tStrings == null) {
			return;
		}
		String[] textStrings = tStrings.split(" ");
		for (int i = textStrings.length - 1; i >= 0; i--) {
			String texString = textStrings[i];
			System.out.print(texString + " ");
		}
	}

	public static void main(String[] args) {
		RotationString04 rotation = new RotationString04();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input string :");
		String text = sc.nextLine();
		rotation.textSplit(text);
		System.out.println("Rotation result is :");
	}
}