package sample;
import lib.Input;
public class Sample08_04 {
	public static void main(String[] args) {
		int a = Input.getInt("a");
		int b = Input.getInt("b");
		
		boolean b1, b2, b3, b4;
		b1 = a>0 && a<20;
		b2 = a<=0 || a>=20;
		b3 = !(a>0 && a<20);
		b4 = (a==0)^(b==0);
		
		System.out.println("   a>0 && a<20   = " + b1);
		System.out.println("  a<=0 || a>=20  = " + b2);
		System.out.println(" !(a>0 && a<20)  = " + b3);
		System.out.println("(a==0) ^ (b==0)  = " + b4);
	}
}
