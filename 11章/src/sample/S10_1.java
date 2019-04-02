package sample;

import lib.Input;

public class S10_1 {

	public static void main(String[] args) {
		int	num = Input.getInt();
		switch(num){
		case	1:
		case	3:
		case	5:
			System.out.println("5以下の奇数");
			break;
		case	2:
		case	4:
			System.out.println("5以下の偶数");
			break;
		default:
			System.out.println("その他の数");
		}
	}
}
