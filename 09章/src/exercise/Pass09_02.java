package exercise;

import lib.Input;

public class Pass09_02 {

	public static void main(String[] args) {
		double number = 0, sum = 0;
		int count = 0;
		while(true) {
			number = Input.getDouble();
			if(number == 0) {
				break;
			}
			sum += number;
			count++;
		}
		System.out.println("合計＝" + sum);
		System.out.println("件数＝" + count);
		System.out.println("平均＝" + sum / count);
	}

}
