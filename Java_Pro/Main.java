public class Main {
	public static void main(String[] args) {
		/* 変数の変更防止 final*/
		final double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "パイの面積は、");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にする");
		
		System.out.println("半径"+ pie + "cmのパイの面積は");
	    System.out.println(pie * pie * pi);
	}
}