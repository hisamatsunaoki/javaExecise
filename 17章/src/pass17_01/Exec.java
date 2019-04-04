package pass17_01;

public class Exec {

	public static void main(String[] args) {
		// ここにコードを挿入
		double[] data = { 65.1, 60.3, 75.5, 70.0, 67.3 };
		Stat exec = new Stat(data);
		System.out.println("最小値＝" + exec.min());
		System.out.println("最大値＝" + exec.max());
		System.out.println("合計＝" + exec.sum());
		System.out.println("平均＝" + exec.average());
	}

}
