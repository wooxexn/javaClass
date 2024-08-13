package day09;

public class Person {
	
	private int age;
	private String name;
	private boolean isMarried;
	private int numberOfChildren;
	
	public void input(int age, String name, boolean isMarried, int numberOfChildren) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.numberOfChildren = numberOfChildren;
		
	}
	
	public void printInfo() {
		System.out.println("이 사람의 나이 : " + age + "살");
	    System.out.println("이 사람의 이름 : " + name );
	    System.out.println("이 사람의 결혼 여부 : " + (isMarried ? "기혼" : "미혼"));
	    System.out.println("이 사람의 자녀 수 : " + numberOfChildren + "명");
	}


}
