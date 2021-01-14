package ch06;
//실행클래스
public class Start {
	
//	클래스는 2가지 형태, 실행 클래스, 라이브러리 클래스
//	실행 클래스는 main() 메소드를 가지고 있음
//	하나의 프로그램은 하나의 main() 메소드와 여러 개의 라이브러리 클래스를 가지고 있음
//	main() 메소드는 프로그램의 시작 지점
//	main() 메소드에서 여러개의 라이브러리 클래스를 객체화하여 라이브러리를 실행함
		public static void main(String[] args) {
		 TODO Auto-generated method stub
//		자바에서 변수 사용 시 선언만 하고 초기화하지 않고 사용 시 오류가 발생함 아래처럼..
//			int studentID;
//			String StudentName;
//			int grade;
//			String address;
//			
//			System.out.println(studentID);
//			System.out.println(studentName);
//			System.out.println(grade);
//			System.out.println(address);
			
//			이렇게 적어주면 객체가 생성됨.
//			제일 앞의 Student는 Student.java 파일의 public class 뒤의 Student를 가리킴
//			두번 째 std는 우리가 만든 Student를 통해서 만든 클래스 변수. 객체이다. 이 행위를 인스턴스화했다. 객체화했다. 라고 함. 
//			new 키워드는 실제로 구현해주는 키워드. 
//			마지막 Student는 제일 앞의 클래스명과 동일. ()가 붙어서. 실제로 메소드로 동작하게 함. 생성자임. 클래스에는 생성자가 무조건 하나가 있다. 이것과 new를 통해서 객체를 생성한다. 
			
//			객체화된 클래스의 멤버변수 및 멤버 메소드를 가져다가 사용하려면 객체명.멤버변수명, 혹은 객체명.멤버메소드명 으로 사용
//			Student 클래스를 클래스 변수 std로 객체화 함
//			Student std = new Student();
			
//			객체화된 std의 멤버변수 studentID를 호출
//			std의 멤버변수 studentID는 0으로 자동 초기화 됨
//			System.out.println(std.studentID);
//			System.out.println(std.studentName);
//			System.out.println(std.address);
//			System.out.println(std.grade);
			
			
			
//			<클래스를 사용하는 이유>
//		 	1. 여러 개의 관련된 데이터를 한 번데 모아서 사용하기 위함
//		 	배열을 사용해서 데이터를 저장해도 상관은 없으나, 자바의 배열은 자바스크립트처럼 여러 가지 데이터 타입을 한 번에 저장할 수 없음. 
//		 	자바의 배열은 같은 종류의 데이터만 저장할 수 있음
//		 	2. 특정 기능을 사용할 경우 데이터 및 기능을 사용하기 쉬움.
//		 	3. 소스의 재활용이 쉬움, 기존의 소스도 짧아짐
		 
			int studentID1 = 1;
			String studentName1 = "아이유";
			int grade1 = 102;
			String address1 = "서울";
			
			System.out.println(studentID1);
			System.out.println(studentName1);
			System.out.println(grade1);
			System.out.println(address1);
			
			int studentID2 = 2;
			String studentName2 = "유인나";
			int grade2 = 102;
			String address2 = "서울";
			
			System.out.println(studentID2);
			System.out.println(studentName2);
			System.out.println(grade2);
			System.out.println(address2);
			
			int studentID3 = 3;
			String studentName3 = "유재석";
			int grade3 = 102;
			String address3 = "서울";
			
			System.out.println(studentID3);
			System.out.println(studentName3);
			System.out.println(grade3);
			System.out.println(address3);
			
			int studentID4 = 4;
			String studentName4 = "유산슬";
			int grade4 = 102;
			String address4 = "서울";
			
			System.out.println(studentID4);
			System.out.println(studentName4);
			System.out.println(grade4);
			System.out.println(address4);
			
			int studentID5 = 5;
			String studentName5 = "유두래곤";
			int grade5 = 102;
			String address5 = "서울";
			
			System.out.println(studentID5);
			System.out.println(studentName5);
			System.out.println(grade5);
			System.out.println(address5);
			
//			전체 데이터를 저장하기 위해서 배열을 4개 선언함. 
//			문제점 : 데이터 저장 시 순서가 바뀔 경우, 데이터의 무결성이 훼손됨.->그래서 이런 식으로 사용 안함.
			int[] studentIds = new int[] {1, 2, 3, 4, 5};
			String[] studentNames = new String] {"아이유", "유인나", "유재석", "유산슬", "유두래곤"
	};
			int[] grades = new int[] {102, 102, 102, 102, 102};
			String[] addrs = new String[] {"서울", "서울", "서울", "서울", "서울"};
			
			for (int i = 0; i < studentIds.length; i++) {
				System.out.println(studentIds[i]);
				System.out.println(studentNames[i]);
				System.out.println(grades[i]);
				System.out.println(addrs[i]);
				
			}
			
//			배열을 사용해서 아이유의 정보만 빼고 싶으면 밑에처럼 일일이 다 적어줘야함. 불편하다. 그래서 클래스 파일을 따로 두면 편하다. 
			System.out.println(studentIds[0]);
			System.out.println(studentNames[0]);
			System.out.println(grades[0]);
			System.out.println(addrs[0]);
			
//			클래스파일에 인풋, 프린트 메소드를 만들어서 아이유의 정보만 빼낼수 있다. 내가 출력하는 순서가 틀려도 잘못된 값이 잘 못 나오지 않는다. 다른 사람과 헷갈리거나 겹치지 않는다. 그래서 클래스를 사용한다. 
			Student std = new Student();
			std.inputInfo(1000,  "아이유",  102,  "서울");
			std.printInfo();
			
//			클래스파일에 인풋 프린트 메소드를 만들어서 유재석의 정보중에서 기능 하나씩 뽑을 수 있다. 클래스파일에 입력하는 부분, 출력하는 부분 만들어서 위와 같이 짧게 쓰거나 아래와 같이 길게 써도 된다. 
			Student std2 = new Student();
			std2.studentId = 2000;
			std2.studentName = "유재석";
			std2.grade = 102;
			std2.address = "서울";
			std2.printInfo();

}
