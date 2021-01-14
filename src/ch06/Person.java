package ch06;

public class Person {
	String name;
	float height;
	float weight;
	
//	기본 생성자, 다른 생성자를 사용했을 경우 기본 생성자가 자동으로 생성되지 않기 때문에, 필요한 경우 직접 구현해야 함. ★★★★★
	public Person() {
		
	}
	
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}