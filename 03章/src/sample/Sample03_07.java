package sample;
public class Sample03_07 {
	public static void main(String[] args) {
		byte	b = 120;
		short	s;
		int		n;
		long	m;
		s=b;		// byteからshortへの自動型変換
		n=s;		// shortからintへの自動型変換
		m=n;		// int からlongへの自動型変換
		System.out.println(m);
		
		b = 10;
	}
}
