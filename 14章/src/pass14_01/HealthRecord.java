package pass14_01;
public class HealthRecord {
	private String name;					// 氏名
	private double height;					// 身長 （m単位）

	public HealthRecord(String name, double height) {
		setName(name);
		setHeight(height);
	}

	public HealthRecord(double height) {
		setName("");
		setHeight(height);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double stdWeight(double height) {	// 身長から計算した標準体重を返す
		return Math.pow(height, 2) * 22;
	}

	@Override
	public String toString() {		// フィールド変数の文字列表現を返す
		return this.name + "/" + this.height + "m";
	}
}
