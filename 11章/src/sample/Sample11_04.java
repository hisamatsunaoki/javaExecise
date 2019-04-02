package sample;

import lib.Input;

public class Sample11_04 {
	public static void main(String[] args) {
		String str = Input.getString();
		switch (str) {
		case "おひつじ座":
		case "おうし座":
		case "ふたご座":
			System.out.println("3/21～6/21");
			break;
		case "かに座":
		case "しし座":
		case "おとめ座":
			System.out.println("6/22～9/22");
			break;
		case "てんびん座":
		case "さそり座":
		case "いて座":
			System.out.println("9/23～12/21");
			break;
		default:
			System.out.println("12/22～3/20");
		}
	}
}
