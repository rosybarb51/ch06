package ch06;

public class CarInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----문제1----");
//		문제 1)
		CarInfo car11 = new CarInfo();
		car11.getCarInfo();
		CarInfo car12 = new CarInfo();
		car12.setCarInfo("쉐보레", "콜로라도", "가솔린", "SUV", "중형", "파랑색", "3,830");
		car12.getCarInfo();
		
		System.out.println("----문제2----");
//		문제 2)
		CarInfo2 car21 = new CarInfo2();
		car21.getCarInfo();
		CarInfo2 car22 = new CarInfo2("콜로라도", "가솔린", "SUV", "3,830");
		car22.getCarInfo();
		CarInfo2 car23 = new CarInfo2("쉐보레", "카마로", "가솔린", "쿠페", "중형","파랑색", "5,450");
		car23.getCarInfo();
		
		
		System.out.println("----문제3----");
//		문제 3)
		CarInfo3 car31 = new CarInfo3();
		CarInfo3 car32 = new CarInfo3("콜로라도", "가솔린", "SUV", "3,830");
		CarInfo3 car33 = new CarInfo3("쉐보레", "카마로", "가솔린", "쿠페","중형", "파랑색", "5,450");
		car31.getCarInfo();
		car32.getCarInfo();
		car33.getCarInfo();
		
				
				
	}

}
