package pass14_01;

public class Exec {
	public static void main(String[] args) {
		HealthRecord exec1 = new HealthRecord("久松直貴", 1.7);
		System.out.println("標準体重" + exec1.stdWeight(1.7));
		System.out.println(exec1.toString());
	}
}
