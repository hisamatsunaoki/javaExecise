package exercise;

import lib.Input;

public class Pass10_02 {
	public static void main(String[] args) {
		int fare = 0;
		int data;
		while((data = Input.getInt()) != 0) {
			if(data < 50) {
				fare = 300;
			} else if(data >= 50 && data < 100) {
				fare = 500;
			} else if(data >= 100 && data < 500) {
				fare = 700;
			} else if(data >= 500) {
				fare = 1000;
			}
			System.out.println(fare + "円");
		}
	}
}
