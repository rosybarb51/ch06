package ch061;

public class Car {
//	접근제한자 private을 사용하여 외부에서 멤버변수에 직접 접근이 불가능함. 
//	동일한 클래스의 멤버끼리는 아무런 제약이 없이 사용이 가능함
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
//		멤버변수인 speed를 제약없이 사용
	}

	
	public void setSpeed(int speed) {
		if (speed < 0 ) {
//		멤버변수인 speed를 제약없이 사용
			this.speed = 0;
//			return : 해당 메소드 즉시 종료
			return;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
