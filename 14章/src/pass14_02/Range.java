package pass14_02;

public class Range {
	private double min;						// 最小値
	private double max;						// 最大値

	public Range(double min, double max) {
		setMin(min);
		setMax(max);
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMin() {
		return min;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMax() {
		return max;
	}

	public boolean isOk(double a) {	// aが範囲内のときtrueを返す
		boolean result = false;
		if(a >= min && a < max) {
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {			// minとmaxの文字列表現を返す
		return "min:" + this.min + "-max:" + this.max;
	}
}
