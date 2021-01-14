package ch061;

import ch06.*;

public class c {
	public static void main(String[] args) 1{
//		a 클래스는 default 접근 제한자를 사용하여 다른 패키지를 사용하는 c 클래스에서는 접근이 불가능함.
//		a a = new a();
//		b 클래스는 public 접근 제한자를 사용하여 다른 어떠한 클래스에서도 접근이 가능하다. 
//		b b = new b();
		
		ABC abc = new ABC();
//		privateName은 ABC 클래스의 멤버 변수로 접근 제한자를 private을 사용했기 때문에 해당 객체 내에서만 사용이 가능함. 
//		System.out.println("privateName : " + abc.privateName);
		System.out.println("protectedName : " + abc.protectedName);
		System.out.println("publicName : " + abc.publicName);
		
		DEF def = new DEF();
		System.out.println("상속받은 protectedName : " + def.protectedName);
		System.out.println("상속받은 publicName : " + def.publicName);
		System.out.println("자신의 publicName : " + def.publicDEFName);
	
	}
	
}













