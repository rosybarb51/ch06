package ch06;

public class Calculator2 {
//	��� ����
	int x;
	int y;
	
//	��� �޼ҵ�
	public void setting(int inputX, int inputY) {
//		������ Ŭ������ ��������� ��ü�� �� ����. �׷��� 
//		��� ���� x, y �Ʒ��� ���� ����� �� �ִ�. 
		x = inputX;
		y = inputY;
// ������ �޸� �� ����ִ� ������ �ش� �ڵ� �� �������� ����ִ�.
// �׷��� �츮�� ���� �����͸� �� setting �ۿ����� ����ϱ�
// ���� ��� ������ ������ ���ִ� ���̴�.		
	}
	
//	return�� �����ϱ� void. ��ȣ �ȿ� �Ű� ���� 2�� ����.
//	������� ��ȣ.
	public void printer(int result, char oper) {
		switch (oper) {
//	if���� ������ ���� �� �� ����ϸ� ����
//	switch���� ������ ������ ���� �ϳ� �� �� ���.
//	�ƴϸ� else if ( == )�� �ص� �ȴ�. 
		case '+':
			System.out.println("�� ���� ������ " + result);
			break;
			
		case '-':
			System.out.println("�� ���� ������ " + result);
			break;
			
		case '/':
			System.out.println("�� ���� �������� " + result);
			break;
			
		case '*':
			System.out.println("�� ���� ������ " + result);
			break;
		}
	}
//	return �κ��� ��������ϱ� void ���ذŴ�.!!!!
//	plus ��ȣ �ȿ� �Ű� ���� ����. �ֳ��ϸ�
//	���� ������ ��� ������ ����ҰŴϱ�
    public void plus() {
//    	������ setting�� ���ؼ� x, y�� ���� �����������ϱ�.
		int result = x + y;
//	    printer�� �տ��� ��� �޼ҵ�� ������ �Ǿ����ϱ�
//	    �տ� ��ü ���� �ʿ���� �̷��� �׳� ����ȴ�.
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
