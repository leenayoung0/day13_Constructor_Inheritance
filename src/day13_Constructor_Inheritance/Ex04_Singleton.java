package day13_Constructor_Inheritance;

import java.util.Calendar;

class Singleton04 {
	private static Singleton04 si;
	private Singleton04() {
		System.out.println("기본 생성자 실행");
	}
	public static Singleton04 getInstance() {
		System.out.println("si : "+si);
		if(si == null)
			si = new Singleton04();
		return si;
	}
}

public class Ex04_Singleton {
	public static void main(String[] args) {
		/*
		 * Singleton04 si = new Singleton04(); Singleton04 si1 = new Singleton04();
		 * Singleton04 si2 = new Singleton04(); Singleton04 si3 = new Singleton04();
		 * //개별적인 공간(여러개 각자의 공간) System.out.println(si); System.out.println(si1);
		 * System.out.println(si2); System.out.println(si3);
		 */
		
		//Calendar cal = Calendar.getInstance();
		Singleton04 si01 = Singleton04.getInstance();
		System.out.println("si01 : "+si01);
		Singleton04 si02 = Singleton04.getInstance();
		System.out.println("si02 : "+si02);
	}

}
