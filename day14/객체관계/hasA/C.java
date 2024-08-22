package day14.객체관계.hasA;

public class C {
	
	D d;
	
	
	
	
	
	public void setD(D d) {
		this.d = d;
	}
	
	
	
	
	
	public void C메서드() {
		System.out.println("C 메서드");
		d.D메서드();
	}


}
