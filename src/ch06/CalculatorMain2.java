package ch06;

public class CalculatorMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		정적 멤버를 사용한 계산기
//		객체화 작업없이 바로 정적 멤버를 사용할 수 있음
		Calculator3.x = 10;
		Calculator3.y = 5;
		Calculator3.plus();
		Calculator3.minus();
		
//		인스턴스 멤버를 사용한 계산기 
//		객체화 작업없이는 인스턴스 멤버의 사용이 불가능함
		Calculator4 cal4 = new Calculator4();
		cal4.x = 10;
		cal4.y = 5;
		cal4.plus();
		cal4.minus();
		cal4.divide();
//	    정적 멤버 메서드는 객체화해서 사용하면 안됨.
//		cal4.multi();
//		정적 멤버 메서드는 클래스명.정적멤버메서드명 으로 사용.
		Calculator4.multi();
		
		System.out.println("\n--------\n");
		
		Calculator5 cal1 = new Calculator5();
		Calculator5 cal2 = new Calculator5();
		
		cal1.x = 10;
		cal1.y = 5;
		cal1.plus();
		
		cal2.x = 100;
		cal2.y = 50;
		cal2.plus();
		
		System.out.println(cal1.x);
		System.out.println(cal2.x);
				
		System.out.println(cal1.staticX);
		System.out.println(cal2.staticX);
		System.out.println(cal1.staticY);
		System.out.println(cal2.staticY);
		
		cal1.staticX = 1000;
		cal2.staticY = 500;
//		아래의 형태는 사용할 수 있으나, 사용하면 안됨.
//		정적멤버는 실제로는 객체화와 아무 관련이 없는 애라서, 아래와 같이 적어도 사실 알고보면 저 밑의 제대로 된 사용 방법대로 적용된다. 공용으로 사용됨. 
		System.out.println(cal1.staticX);
		System.out.println(cal2.staticX);
		System.out.println(cal1.staticY);
		System.out.println(cal2.staticY);
		
//		정적 멤버의 제대로 된 사용 방법.
		System.out.println(Calculator5.staticX);
		
		System.out.println("\n--------\n");
		
//		생성자는 객체 생성 시 자동 실행.
//		new 뒤에 적는 것이 클래스가 아니라 생성자임. 
		Calculator6 cal61 = new Calculator6();
		
		Calculator6 cal62 = new Calculator6(100);
//		생성자를 만들 때 매개변수 넣는 부분 만들었으니까 그 형태와 똑같이 써야한다. 
		Calculator6 cal63 = new Calculator6(10, 5);
		
		
		
		
//		cal61.x = 10;
//		cal61.y = 5;
		
//		프로그램 실행 시 매번 필요한 값을 입력해야해서 불편함. 
//		실수로 setValue()를 실행하지 않고 plus()를 실행 시 오류가 발생.
//		setValue()를 실행하지 않았을 경우에는 기본값이 입력되어 실행되기를 원할 경우 사용하는 것이 생성자.
//		cal61.setValue(1000, 500);
		
		cal61.currentValue();
		
		cal61.setValue(100, 50);
		cal61.currentValue();
		
		cal61.plus();
		
		
		System.out.println("\n-----생성자 오버로딩----\n");
		
		Calculator7 cal71 = new Calculator7(1000, 500);
		Calculator7 cal72 = new Calculator7(100);
		
		Calculator7 cal73 = new Calculator7();
	}

}

