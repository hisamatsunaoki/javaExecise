package pass13_01;

public class Exec {

	public static void main(String[] args) {
		// ここにコードを挿入
		Denpyo denpyo1 = new Denpyo();
		denpyo1.date = "01-15";
		denpyo1.item = "パソコン";
		denpyo1.price = 50000;
		denpyo1.number = 1;
		denpyo1.disp();
		Denpyo denpyo2 = new Denpyo();
		denpyo2.date = "01-16";
		denpyo2.item = "コピー用紙";
		denpyo2.price = 600;
		denpyo2.number = 5;
		denpyo2.disp();
	}

}
