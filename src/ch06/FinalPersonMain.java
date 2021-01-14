package ch06;

public class FinalPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalPerson fp1 = new FinalPerson("123456-1234567", "키미 슈미트");
		
		System.out.println(fp1.nation);
		System.out.println(fp1.ssn);
		System.out.println(fp1.name);
		
//		final 키워드를 사용했기 때문에 수정이 불가능함. 
//		fp1.nation = "USA";
//		fp1.ssn = "555555-5555555";
		fp1.name = "피노누아";
		
		
		System.out.println("\n---- 상수 사용 ----\n");
		
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA + "km^2");

	}
	
	

}
















