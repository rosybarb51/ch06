package ch06;

public class Car {
	int gas;
	
//	setGas를 통해서 우리가 받은 gas데이터를 위의 gas에 
//	계속 저장해서 살아있게 해준다.
	public void setGas(int inGas) {
		gas = inGas;
	}
	
//	public 생략해도 된다. 그럼 앞에 접근제한자 defalt가 
//	붙는데,.... 자세한건 나중에
	public boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		
//		아무것도 없이 적어도 되고 else 적어도 된다. 
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	public void run() {
//		while 문 무한루프
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas 잔량 : " + gas + ")");
			}
			else {
				System.out.println("멈춥니다.(gas 잔량 : " + gas + ")");
//				braek를 넣으면 해당 while의 코드 블럭이 멈춤
//				return을 넣으면 해당 메소드가 멈춤.
				return;
			}
		}
	}
}