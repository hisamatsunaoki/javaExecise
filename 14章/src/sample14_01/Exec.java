package sample14_01;

public class Exec {
	public static void main(String[] args) {
		Dice dice1 = new Dice(1);
		Dice dice2 = new Dice(2);
		Dice dice3 = dice1;
		System.out.println("目数＝" + dice1.val);
		System.out.println("目数＝" + dice2.val);
		System.out.println("目数＝" + dice3.val);
		dice1.val = 3;
		System.out.println("目数＝" + dice1.val);
		System.out.println("目数＝" + dice3.val);
	}
}
