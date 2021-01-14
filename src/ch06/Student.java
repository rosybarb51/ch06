package ch06;
//라이브러리 클래스
public class Student {
//	필드, 멤버변수(Student 클래스의 멤버이다. 변수형태인 멤버이다.)
	int studentID;
	String studentName;
	int grade;
	String address;
	
//	입력하는 부분
	public void inputInfo(int id, String name, int grad, String addr) {
		studentID = id;
		studentName = name;
		grade = grad;
		address = addr;
	}
	
//	이렇게 해놓으면 배열에서 특정한 학생의 정보만 빼놓을 때 편리하다.
//	출력하는 부분
	public void printInfo() {
		System.out.println(studentID);
		System.out.println(studentName);
		System.out.println(grade);
		System.out.println(address);
	}
}