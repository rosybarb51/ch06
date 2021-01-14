package ch06;

public class Calculator6 {
	private int x;
	private int y = 10;
	
//	아래와 같은 것이 생성자. 
//	생성자는 객체 생성 시 가장 먼저 실행됨.
//	멤버 변수의 초기화 및 멤버 메소드를 실행하는 역할.
//	생성자는 클래스명과 동일한 이름을 사용함.
//	생성자는 메소드와 거의 동일한 기능을 가지고 있음.. 그래서 뒤에 매개변수를 받아주는 부분()을 붙여준다..ㅎ
//	생성자는 반환값이 없음!(return 키워드를 사용하지 않는다. - return의 기능 : 1. 호출한 것을 되돌려주는 기능. 2. 해당 메소드가 직접 종료되는 기능. )
	public Calculator6() {
		this.x = 10;
		this.y = 5;
	}
		
//		return; 메모리에 등록과 동시에 메모리에서 삭제. 생성자와 함께 사용하면... 그래서 생성자는 return문과 함께 사용하지 않음. 그래서 public 다음에 반환값을 아예 적지 않는다. 반환값은 return을 사용할 때 쓰는 거니까!

	
	public Calculator6(int x) {
		this.x = x;
	}
		
		
	public Calculator6(int x, int y) {
//		생성자 생성과동시에 초기화. 이렇게 생성자에서도 멤버변수 사용가능함~!!
		this.x = 10;
		this.y = 5;
		
//		생성자 생성과 동시에 현재값 보여주게. 이렇게 생성자에서도 멤버메소드 사용가능함~!!
		currentValue();
	}
	
	public void setValue(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void currentValue() {
		System.out.println("현재 x : " + x);
		System.out.println("현재 y : " + y);
	}
	
	public void plus() {
		System.out.println("두 수의 덧셈은 : " + (x + y));
	}
}