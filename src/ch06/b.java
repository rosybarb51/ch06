package ch06;

import ch061.*;
// public 접근 제한자 사용. 
public class b {
//	a 클래스는 default 접근 제한자를 사용하여 동일한 패키지를 사용하는 b 클래스에서 호출이 가능함. 
	a a = new a();
	
	public b() {
		DEF def = new DEF();
//		ABC 클래스의 멤버 변수인 protectedName은 접근제한자가 protected를 사용하여 상속받은 클래스에서는 사용이 가능하지만 패키지가 변경되면 사용할 수 없음.
		System.out.println("상속받은 protectedName : " + def.protectedName);
		System.out.println("상속받은 publicName : " + def.publicName);
	}
}
