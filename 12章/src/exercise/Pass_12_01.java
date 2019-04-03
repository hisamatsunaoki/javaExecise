package exercise;

import lib.Input;

public class Pass_12_01 {

	public static void main(String[] args) {
		// ここにコードを挿入
		double input = Input.getDouble("mile");
		System.out.println(input + "マイル=" + mileToKm(input) + "キロ");
	}

	public static double mileToKm(double mile) {
		return mile * 1.609344;
	}

}
