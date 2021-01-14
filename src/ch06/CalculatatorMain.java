package ch06;

public class CalculatatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator 클래스를 myCal 이란 이름으로 객체화
		Calculator myCal = new Calculator();
//		Calculator 클래스의 멤버 메소드 powerOn()을 실행
		myCal.powerOn();
		
//		정수형 변수 result를 선언하고, Calculator 클래스의 멤버 메소드 plus()를 실행
//		매개변수 5, 6을 넘겨줘서 실행
		int result = myCal.plus(5, 6);
		System.out.println("result = " + result);
		
//		멤버 변수가 아닌 그냥 일반 변수
		byte x = 10;
		byte y = 4;
//		myCal의 멤버 메소드 divide()를 실행
//		매개변수를 x, y 2개를 가지고 실행
//		divide() 메소드는 매개변수로 int 타입의 변수를 2개 받으나
//		실제로 넘겨준 x, y는 byte 타입이었음
//		int  타입은 byte 타입보다 데이터 타입의 크기가 크기 때문에
//		byte 타입은 int 타입으로 자동 타입 변환이 발생함. 
//		divide의 리턴값을 클래스 파일에서 double형으로 받기때문에
//		아래와 같이 divide의 리턴값을 받는 dResult도 double형으로 해줘야한다.
		double dResult = myCal.divide(x, y);
		System.out.println("dResult = " + dResult);
		
//		곱하기
		int x2 = 12;
		int y2 = 30;
		
		double dMResult = myCal.multiple(x2, y2);
		System.out.println("dMResult = " + dMResult);
		
//		빼기
		int result2 = myCal.minus(153, 36);
		System.out.println("result2 = " + result2);
		
		myCal.powerOff();

	
//		문제2)
		
		Calculator2 cal = new Calculator2();
		cal.setting(10, 5);
//		cla 객체의 멤버변수 호출한 방법
//		위의 방법 대신 아래와 같이 사용해도 됨. 
//		cal.x = 10;
//		cal.y = 5;
		
//		뒤에 괄호가 있으면 함수이다. 메소드. 실행한다는 것.
//		cal의 멤버 메소드 plus를 호출해서 실행함.
		cal.plus();
		cal.minus();
		cal.multi();
		cal.div();
	
	
	
	
	
	}

}

// 문제 1) Calculator 클래스를 수정하여 곱하기, 빼기 
// 메소드를 생성하고 사용하는 프로그램을 작성하세요.
// 곱하기 메소드명 : multiple
// 빼기 메소드명 : minus
// 압축 파일명 : Calculator_이름.zip
// 압축할 파일명 : CalculatorMain.java, Calculator.java

// 문제 2) Calculator2 클래스를 생성하고, 사칙연산을 위한 
// 멤버 변수 x, y와 멤버 메소드 plus, minus, multi, div 를
// 선언하고, 데이터를 입력하기 위한 멤버 메서드 setting(),
// 출력 전용 메소드 printer() 를 만들어서 사칙연산을 진행하는
// 프로그램을 제작하세요
// 생성할 멤버 변수 : x, y
// 멤버 메소드 : plus, minus, multi, div, setting, printer
// 매개변수는 setting과 print만 존재. 나머지는 매개변수 없음.
// plus, minus, multi, div는 멤버 변수를 이용해서 연산
// 결과는 printer 메소드를 이용해서 결과를 출력
// return 대신 printer(result); 이렇게 해서..

// 조건 : 멤버 변수 x, y를 가지고 사칙연산
// 출력은 printer 이 전담
// plus, minus, multi, div 에서 printer를 실행
// 클래스 파일에서
// 클래스 멤버의 특징
// 클래스 내부에서는 자신의 멤버끼리는 객체명 사용 안함
// 메서드명, 변수명 그대로 사용
// 그러나 클래스 외부에서는 클래스의 멤버를 호출 시 반드시
// 객체명.멤버명을 사용해야함.