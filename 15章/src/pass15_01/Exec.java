package pass15_01;

public class Exec {

	public static void main(String[] args) {
		// ここにコードを挿入
		Dice dice1 = new Dice(6, "黒");
		Dice dice2 = dice1;
		dice2.play();
		System.out.println("目数" + dice1.getVal() + " 色" + dice1.getColor());
		System.out.println("目数" + dice2.getVal() + " 色" + dice2.getColor());
	}

}
