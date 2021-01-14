package ch06;

public class Calculator {
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
//	외부에서 입력받은 매개변수 2개를 합하여 정수형으로 되돌려줌.
//	return 시 되돌려주는 결과값의 데이터 타입은 메소드 명 앞에 있는 데이터 타입으로 결정됨.
//	여기서는 plus 앞의 int 타입으로 결정된다.
	public int plus(int x, int y) {
		int result = x + y;
		
//		return 키워드를 사용하여 결과값을 호출한 시점으로 되돌려줌
		return result;
	}
	
	public int minus(int x, int y) {
		int result = x - y;
		
		return result;
	}
	
	public double divide(int x, int y) {
		double result = x / y;
		
		return result;
	}
	
	public double multiple(int x, int y) {
		double result = x * y;
		
		return result;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
