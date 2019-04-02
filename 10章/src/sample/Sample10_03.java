package sample;
import lib.Input;
public class Sample10_03 {
	public static void main(String[] args) {
		int num = Input.getInt();
		if (num == 1) { 					// 1の時
			System.out.println("賛成");
		} else if (num == 2) {				// それ以外で、2の時
			System.out.println("反対");
		} else if (num == 3) { 				// それ以外で、3の時
			System.out.println("棄権");
		} else {							// それ以外の時
			System.out.println("無効");
		}
	}
}
