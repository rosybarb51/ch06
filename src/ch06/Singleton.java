package ch06;

public class Singleton {
//	singleton이 객체로 만들어져야하는데, 저어기 밑에 private으로 외부에 생성자를 공개하지 않기 때문에, 이 Singleton 이 객체를 만들 수 없다. 그러나 static을 붙여서 (static : 1. 프로그램이 실행될 때 메모리상에 같이 올라가기, 2. 다른 객체와 데이터 공유하기) single이라는 객체를 만들어서 Singleton에 넣어준다. 
	private static Singleton single = new Singleton();
	
//	싱글톤은 싱글톤부분에 프라이빗 붙이고 안에 내용없이 만든다. 
//	접근 제어자 private을 생성자에 사용하게 되면, 생성자에 접근이 불가능하여 객체를 생성할 수 없음. 
//	컴파일러가 자동으로 생성하는 기본 생성자는 접근제어자가 public 이라서, 안에 아무 내용 없어도 private을 붙여서 외부에서 사용할 수 없게 만든다.  
//	같은 클래스 내부에서는 사용할 수 있다. 
	private Singleton() {
		
	}
	
//	static 다음에 아무것도 안 붙어있어서, 외부에서 getInstance()에 접근이 가능하다. 
//	위에서 static으로 객체 single을 Singleton에 저장해줘서 여기서 사용할 수 있다. 
	static Singleton getInstance() {
		return single;
	}
	
}
