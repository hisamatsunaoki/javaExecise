package exercise;

public class Pass07_02 {

	public static void main(String[] args) {
		String name[] = { "田中", "中村", "鈴木", "山本", "本田" };
		int kokugo[] = { 82, 85, 74, 90, 70 };
		int eigo[] = { 70, 74, 88, 74, 82 };
		int sumKokugo = 0, sumEigo = 0;
		String[] aveInfo = new String[5];
		for(int i = 0; i < name.length; i++) {
			sumKokugo += kokugo[i];
			sumEigo += eigo[i];
			aveInfo[i] = name[i] + " : " + ((double) kokugo[i] + eigo[i]) / 2;
		}
		System.out.println("国語平均" + (double) sumKokugo / name.length);
		System.out.println("英語平均" + (double) sumEigo / name.length);
		System.out.println("科目平均" + ((double) sumKokugo + sumEigo) / (name.length * 2));
		for(int i = 0; i < name.length; i++) {
			System.out.println(aveInfo[i]);
		}

	}

}
