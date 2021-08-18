package quiz02;

import java.util.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class TimerQuiz{
	private Date date;
	private SimpleDateFormat simpl;
	
	public void setDate() {
		//this.date = date;
		date = new Date();
		simpl = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
	}
	public String getDate() {
		return simpl.format(date);
	}

	public void time() {
		for(int i=0; i<10; i++) {
			setDate();
			String s = getDate();
			System.out.println(s);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
class Win7 extends TimerQuiz {
	private HashMap hm;


	public void setHm() {
		hm = new HashMap();
		hm.put("메모장", "notepad");
		hm.put("계산기", "calc");
	}
	
	public void display() {
		setHm();
		int num;
		String s;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 환 영 합 니 다 =====");
		System.out.println("1.기 능");
		System.out.println("2.off");
		System.out.print("입력 >>>> ");
		num = sc.nextInt();
		while(true) {
			switch(num) {
			case 1: System.out.println("사용 가능 기능");
					System.out.println("1 : 메모장");
					System.out.println("2 : 계산기");
					System.out.print("사용할 기능 입력 : ");
					s = sc.next();
					if(hm.containsKey(s)) {
						ProcessBuilder pro = new ProcessBuilder((String)hm.get(s));
						try {
							pro.start();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println((String)hm.get(s)+"동작 합니다");
						break;
					}else System.out.println("없는 기능 입니다"); break;
			
			case 2: System.out.println("프로그램을 종료합니다");
					return;
			
			}
		}
	}
}

class Login extends Win7{
	private String userId=null,userPw=null;
	public int compare(String userId,String userPw){
		if(getUserId() != null  && getUserPw() != null)
			if(getUserId().equals(userId) && getUserPw().equals(userPw)) return 0;
			else return 1;
		return 1;
	}
	public boolean out(){	return false;	}
	public String getUserId() {	return userId;	}
	public void setUserId(String userId) {	this.userId = userId;	}
	public String getUserPw() {	return userPw;	}
	public void setUserPw(String userPw) {	this.userPw = userPw; }
}


public class Quiz02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num=0,result=0; String inputId=null,inputPw=null;
		Login lo = new Login(); boolean flag=true;
		
		lo.time();
		while(flag){
			System.out.print("1.로그인  2.가 입  3.로그아웃 \n>>>"); num = input.nextInt();
			switch(num){
			case 1:System.out.print("아이디 입력 : ");inputId = input.next();
			System.out.print("비밀번호 입력 : "); inputPw = input.next();
			result = lo.compare(inputId,inputPw);
			if(result == 0) {
				System.out.println("인증 통과");
				lo.display();
				System.out.println("프로그램 종료");
				return;
			}
			else  System.out.println("인증 실패");
			break;
			case 2: System.out.print("가입 id : "); inputId = input.next();
			System.out.print("가입 pw : "); inputPw = input.next();
			lo.setUserId(inputId);
			lo.setUserPw(inputPw);
			System.out.println("저장 완료");
			break;
			case 3:flag=lo.out();System.out.println("종료 합니다");
			}
		}

	}

}


