package sample;

import lib.Input;

public class Sample09_03 {
	public static void main(String[] args) {
		String s;
		while ((s = Input.getString()) != null) { // sがnullでければ繰り返す
			System.out.println(s);
		}
	}
}
