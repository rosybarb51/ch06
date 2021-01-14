package ch06;

public class Calculator2 {
//	멤버 변수
	int x;
	int y;
	
//	멤버 메소드
	public void setting(int inputX, int inputY) {
//		동일한 클래스의 멤버끼리는 객체명 안 쓴다. 그래서 
//		멤버 변수 x, y 아래와 같이 사용할 수 있다. 
		x = inputX;
		y = inputY;
// 변수가 메모리 상에 살아있는 범위는 해당 코드 블럭 내에서만 살아있다.
// 그런데 우리가 받은 데이터를 이 setting 밖에서도 사용하기
// 위해 멤버 변수에 저장을 해주는 것이다.		
	}
	
//	return이 없으니까 void. 괄호 안에 매개 변수 2개 받음.
//	결과값과 기호.
	public void printer(int result, char oper) {
		switch (oper) {
//	if문은 조건이 범위 일 때 사용하면 좋다
//	switch문은 조건이 지정된 값을 하나 고를 때 사용.
//	아니면 else if ( == )로 해도 된다. 
		case '+':
			System.out.println("두 수의 덧셈은 " + result);
			break;
			
		case '-':
			System.out.println("두 수의 뺄셈은 " + result);
			break;
			
		case '/':
			System.out.println("두 수의 나눗셈은 " + result);
			break;
			
		case '*':
			System.out.println("두 수의 곱셈은 " + result);
			break;
		}
	}
//	return 부분이 비어있으니까 void 해준거다.!!!!
//	plus 괄호 안에 매개 변수 없다. 왜냐하면
//	위에 지정한 멤버 변수를 사용할거니까
    public void plus() {
//    	위에서 setting을 통해서 x, y에 값을 지정해줬으니까.
		int result = x + y;
//	    printer도 앞에서 멤버 메소드로 선언이 되었으니까
//	    앞에 객체 붙일 필요없이 이렇게 그냥 쓰면된다.
		printer(result, '+');
	}
			
	public void minus() {
		int result = x - y;
		printer(result, '-');
	}
	
	public void multi() {
		int result = x * y;
		printer(result, '*');
	}
	
	public void div() {
		int result = x / y;
		printer(result, '/');
	}

}
