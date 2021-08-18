package day13_Constructor_Inheritance;
class AAA{
	public void aaa() {System.out.println("test");}
}
class Calc06 extends AAA{
	public int n = 12345;
	public String s = "부모 문자열";
	private String ss = "private 변수";
	protected String sss = "protected 변수";
	public Calc06(String s) {
		System.out.println(s+ "부모 생성자");
	}
	public void test() {
		System.out.println("부모 test 실행");
	}
}
class Computer06 extends Calc06{
	public int n = 7777;
	public Computer06(String ss) {
		super(ss);
		System.out.println(ss+" : 자식 생성자");
		//test(); // 자기꺼 실행
		//this.test(); // 모호하지 않게 내꺼 실행이라는
		super.test();// 내꺼가 아닌 부모의 test를 실행
		System.out.println("n : " + n); // 자기 자신
		System.out.println("this.n : " + super.n); // 부모
		System.out.println("super.s : "+ s);
		//System.out.println("super private ss : " + super.ss);
		System.out.println("super protected sss : "+ super.sss);
	}
	public void test() {//오버라이드 나중에 배울거
		System.out.println("자식 test 실행");
	}
	
}
public class Ex06_Inheritance {
	public static void main(String[] args) {
		Computer06 com = new Computer06("전달");
		com.aaa();
	}

}
