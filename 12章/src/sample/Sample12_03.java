package sample;

public class Sample12_03 {
	public static void main(String[] args) {
		System.out.println("*** BMIを計算 ***");
		double bmi = getBmi(1.75, 70.0);
		System.out.println("BMIは"+bmi+"です");
		System.out.println("*** END ***");
	}
	public static double getBmi(double height, double weight){
		double bmi = weight / Math.pow(height, 2);
		return	bmi;
	}
}
