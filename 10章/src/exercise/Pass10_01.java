package exercise;

import lib.Input;

public class Pass10_01 {
	public static void main(String[] args) {
		String data;
		String[] eigo = { "dog", "cat", "mouse", "rabbit" };
		String[] japa = { "犬", "猫", "鼠", "兎" };
		String output = "";
		while((data = Input.getString()) != null) {
			if(data.compareTo(eigo[0]) == 0) {
				output = japa[0];
			} else if(data.compareTo(eigo[1]) == 0) {
				output = japa[1];
			} else if(data.compareTo(eigo[2]) == 0) {
				output = japa[2];
			} else if(data.compareTo(eigo[3]) == 0) {
				output = japa[3];
			} else {
				output = "?";
			}
			System.out.println(output);
		}
	}
}