package exercise;

public class Pass11_02 {

	public static void main(String[] args) {
		int[] val = { 10, -12, 5, -12, 12, 25 };
		for(int element : val) {
			if(element < 0) {
				System.out.println("負の値です。");
				continue;
			}
			System.out.println(element + "の平方根は" + Math.sqrt(element) + "です");
		}

	}

}
