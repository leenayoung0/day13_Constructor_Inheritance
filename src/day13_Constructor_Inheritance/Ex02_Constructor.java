package day13_Constructor_Inheritance;

import java.util.Scanner;

class Constructor02{
	private int age;
	public Constructor02(int age) {
		this.age = age-1;
	}
	public int getAge() {
		return age;
	}
}

public class Ex02_Constructor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("나이 입력");
		int age = input.nextInt();
		Constructor02 con = new Constructor02(age);
		System.out.println("나이 : "+con.getAge());
	}

}
