package sample;

import lib.Input;
public class Sample10_05 {
	public static void main(String[] args) {
		int sansei=0, hantai=0, data;			// 変数を宣言し0を入れておく
		while( (data=Input.getInt())!=0){
			if(data==1){						// 1ならsanseiを1増やす
				sansei++;
			}else{								// 1でなければhantaiを1増やす
				hantai++;
			}
		}
		System.out.println("賛成="+sansei);
		System.out.println("反対="+hantai);
	}
}
