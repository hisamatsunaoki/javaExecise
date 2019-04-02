package exercise;

import lib.Input;

public class Pass09_01 {

	public static void main(String[] args) {
		String inputText;
		while(true) {
			inputText = Input.getString();
			if(inputText == null) {
				System.out.println("nullのため終了");
				break;
			}
			System.out.println("<" + inputText.length() + ">" + inputText);
		}

	}

}
