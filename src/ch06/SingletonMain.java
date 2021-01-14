package ch06;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		오류 발생, new 키워드 뒤에 Singleton 클래스의 생성자 Singleton()을 호출해야 객체가 생성되는데, 현재 Singleton() 생성자의 접근 제어자가 private으로 설정되어 있어 외부에서 접근할 수 없음
//		Singleton obj1 = new Singleton();
		
//		기존에 만들어놓은 동일한 객체를 넣어주는 것이기 때문이다. single이라는... 
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
//		new 키워드를 사용하면 힙 메모리영역에 새로운 공간을 만들어서 각 객체는 다르다. 
		Singleton obj3 = new Singleton();
		Singleton obj4 = new Singleton();
		
		if (obj1 == obj2) {
			System.out.println("두 객체는 동일하다.");
		}
		else {
			System.out.println("두 객체는 다르다.");
		}
		
		if (obj3 == obj4) {
			System.out.println("두 객체는 동일하다.");
		}
		else { 
			System.out.println("두 객체는 다르다.");
		}
	}

}
