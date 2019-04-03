package exercise;

import lib.Input;

public class Pass10_03 {

	public static void main(String[] args) {
		// ここにコードを挿入
		String month = "";
		int data;
		while((data = Input.getInt()) != 0) {
			if(data == 12 || (data >= 1 && data <= 2)) {
				month = "冬";
			} else if(data >= 3 && data <= 5) {
				month = "春";
			} else if(data >= 6 && data <= 8) {
				month = "夏";
			} else if(data >= 9 && data <= 11) {
				month = "秋";
			} else {
				month = "?";
			}
			System.out.println(month);
		}
	}

}
