package day14.객체관계.hasA;


// has a
// 다른클래스를 멤버로 가지는 것을 말한다
public class A {
	
	
	B  b;
	//B b = new B();
	
	public A() {
		b = new B();
	}
	
	
	
	
	public void A메서드() {
		System.out.println("A 메서드");
		b.B메서드();
	}

}
