package exercise;

public class Pass07_01 {

	public static void main(String[] args) {
		double datas[] = { 12.3, 13.5, 11.5, 13.0, 12.8, 12.5 };
		double sum = 0, count = 0;
		String conc = "";
		for(double data : datas) {
			sum += data;
			count++;
			conc += data + "\t";
		}
		System.out.println("合計" + sum);
		System.out.println("合計" + sum / count);
		System.out.println(conc);
	}

}
