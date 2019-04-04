package pass17_01;
public class Stat extends BasicStat {
	public double sum;

	public Stat(double[] data) {
		super(data);
	}

	public double sum() {
		for(double ele : getData()) {
			this.sum += ele;
		}
		return this.sum;
	}

	public double average() {
		return this.sum / getData().length;
	}
}
