package ch06;

public class CarInfo {
//	멤버 변수
	String company;
	String model;
	String gasType;
	String type;
	
	
	
	public CarInfo() {
		
	}
	
	public void Input(String com, String mod, String fuel, String kind, String col, String mon) {
		System.out.println("�ش� ���� ȸ��� " + com + "\n�𵨸��� " + mod + "\n���������� " + fuel + "\n�������� " + kind + "\n������ " + col + "\n������ " + mon + "���Դϴ�.\n");
	}
}


