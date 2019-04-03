package exercise;

import lib.Input;

public class Pass11_01 {

	public static void main(String[] args) {
		// ここにコードを挿入
		int quantity = 0;
		int cost = 0;
		String code = "";
		quantity = Input.getInt("商品の数量");
		code = Input.getString("商品コード");
		switch (code) {
		case "a100":
			cost = 100;
			break;
		case "a110":
			cost = 200;
			break;
		case "b100":
			cost = 100;
			break;
		case "b110":
			cost = 200;
			break;
		case "b120":
			cost = 200;
			break;
		case "c100":
			cost = 300;
			break;
		case "c110":
			cost = 300;
			break;
		case "d100":
			cost = 400;
			break;
		default:
			cost = 500;
			break;
		}
		System.out.println("合計金額=" + cost * quantity + "円");

	}

}
