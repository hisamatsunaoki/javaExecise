package sample;

import lib.Input;
public class Sample08_03 {
	public static void main(String[] args) {
		String  str = Input.getString();
		System.out.println( str.equals("abc") );	// strは"abc"である
		System.out.println( !str.equals("abc") );	// strは"abc"ではない
	}
}
