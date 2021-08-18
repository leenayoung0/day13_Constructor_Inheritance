package day13_Constructor_Inheritance;

import java.util.Calendar;

class Singleton01{
	public int num;
	
}

public class Ex03_Singleton {
	public static void main(String[] args) {
		//Calendar cal = new Calendar();  // 이렇게 쓰지 않음
		Calendar cal = Calendar.getInstance(); //이렇게 받아오는 식으로
											   //클래스 이름으로 접근
		
		Singleton01 si = new Singleton01();
		Singleton01 si02 = si; // 같은 공간을 알고 있는것 (하나의 공간 같이 공유해서 씀)//new Singleton01();
		// ㄴ> 이게 singleton
		
		si.num = 12345;
		si02.num = 4444;
		System.out.println("si.num : "+si.num);
		System.out.println("si02.num : "+si02.num);
		
		System.out.println("si : "+si);
		System.out.println("si02 : "+si02);
	}

}
