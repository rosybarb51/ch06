package ch06;

public class Calculator7 {
	private int x;
	private int y;
	
//	매개변수를 2개 받는 생성자
	public Calculator7(int x, int y) {
		System.out.println("매개변수가 2개인  생성자 찾아옴");
		this.x = x;
		this.y = y;
		
		getValues();
	}
	
//	매개변수를 1개 받는 생성자
	public Calculator7(int x) {
//		매개변수 2개를 받는 생성자로 이동
		this(x, 5);
	}
	
//	매개변수를 받지 않느 생성자
	public Calculator7() {
//		매개변수를 1개 받는 생성자로 이동
		this(10);
		
		getValues();
	}
	
	public void getValues() {
		System.out.println("현재 설정된 데이터는\nX : " + x + "\nY : " + y);
	}
	
	public void setValues(int x, int y) {
		System.out.println("값을 변경합니다.");
		this.x = x;
		this.y = y;
		
		getValues();
	}
	
	public void plus() {
		System.out.println(x + " + " + y + " = " + (x + y));
	}
}



