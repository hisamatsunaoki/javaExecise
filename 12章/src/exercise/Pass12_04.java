package exercise;

import lib.Input;

public class Pass12_04 {
	public static void main(String[] args) {
		int height, width, depth, weight;
		height = Input.getInt("縦");
		width = Input.getInt("横");
		depth = Input.getInt("高さ");
		String outputText;
		if(isOk(height, width, depth)) {
			weight = Input.getInt("重さ");
			int cost = ryokin(height, width, depth, weight);
			outputText = "	料金" + cost + "円";
		} else {
			outputText = "サイズオーバー";
		}
		System.out.println(outputText);
	}

	public static boolean isOk(int height, int width, int depth) {
		int sum = height + width + depth;
		boolean result = false;
		if(sum < 180) {
			result = true;
		}
		return result;
	}

	public static int ryokin(int height, int width, int depth, int weight) {
		int sum = height + width + depth;
		int cost;
		if(weight <= 5) {
			cost = 500;
		} else if(weight <= 10) {
			cost = 1000;
		} else {
			cost = 1500;
		}
		if(sum > 90) {
			cost = cost * 2;
		}
		return cost;
	}

}
