package pass14_02;

public class Exec {
	public static void main(String[] args) {
		Range exec = new Range(50, 250);
		double[] datas = { 150.5, 75.1, 35.3, 281.2, 210.3 };
		for(double data : datas) {
			System.out.println(data + " : " + exec.isOk(data));
		}
		System.out.println(exec.toString());
	}
}
