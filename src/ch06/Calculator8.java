package ch06;

// 메서드 오버로딩 : 하나의 이름으로 여러 개의 메서드를 생성하는 방법
// 조건 : 매개변수의 타입, 개수, 순서가 달라야 함.
// 
public class Calculator8 {
	
//	1. 정사각형이 너비를 구하는 메소드
	double areaRectangle(double width) {
		return width * width;
	}
	
//	1-1. 1번과 매개변수의 개수는 같으나, 매개변수의 데이터 타입(괄호 안의 타입임/제일 앞의 반환타입은 상관없음)이 다르기 때문에 오버로딩이 가능함.
	int areaRectangle(int width) {
		return width * width;
	}
	
//	2. 직사각형의 너비를 구하는 메소드
//	매개변수의 개수가 달라서 오버로딩이 가능함
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
//	2-2. 2번에서 순서를 변경하여 오버로딩을 할 경우 변수의 이름 순서가 아닌, 타입의 순서가 변경되어야 오버로딩이 가능함.
//	그래서 변수 이름의 순서가 다른 아래의 경우는 불가능함.
//	double areaRectangle(double height, double width) {
//		return width * height;
//	}
	
//	2-3. 2번과 매개변수의 개수는 같으나 매개변수의 데이터 타입이 다르기 때문에 오버로딩이 가능함.
//	제일 앞의 반환타입은 상관없다. 괄호 안의 매개변수 타입에 따름.
	double areaRectangle(int height, int width) {
		return width * height;
	}
	
//	2-4. 2-3번과 매개변수의 개수와 데이터 타입은 같으나, 매개변수의 데이터 타입의 순서가 다르기 때문에 오버로딩이 가능함.
//	사람이 보기에는 똑같지만, 컴퓨터가 볼 때는 인덱스 번호로 구분하기 때문에 다른 것으로 인식해서 오버로딩이 가능하다. 
	double areaRectangle(int width, double height) {
		return width * height;
	}
	
//	2-5. 2-4번과 같아보이지만, 매개변수 타입의 순서가 달라서 가능하다. 순서는 인덱스 번호로 판단하기 때문에 
	double areaRectangle(double height, int width) {
		return width * height;
	}
}















