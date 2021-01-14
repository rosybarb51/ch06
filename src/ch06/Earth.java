package ch06;

public class Earth {
//	상수
//	final 키워드를 사용하여 변수 선언 시 데이터 입력 후 더 이상 수정 불가. 
//	static 키워드를 사용하여 객체를 생성하지 않고 사용가능 클래스.멤버명으로 사용가능
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
//	static으로 이루어진 코드 블럭.
//	: static 키워드를 사용한 멤버들을 초기화하는 데 사용하는 코드 블럭. 일종의 생성자..
//	static 키워드를 사용한 정적 멤버 전용 생성자라고 생각하면 된다. 
//	Earth라고 하는 클래스의 프로그램이 동작할 때, static이 자동으로 실행돼서 아래의 내용으로 위의 static 멤버를 초기화를 시켜준다. (생성자처럼)
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
