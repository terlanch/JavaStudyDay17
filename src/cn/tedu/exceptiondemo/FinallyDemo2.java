package cn.tedu.exceptiondemo;

public class FinallyDemo2 {
	public static void main(String[] args) {
		Person p = demo();
		System.out.println(p);
	}
	public static Person demo(){
		Person p = null;
		try{
			p = new Person();
			p.setName("lili");
			p.setAge(11);
			return p;
		}finally{
			//p = new Person();
			p.setName("lulu");
			p.setAge(10);
		}
		
	}
}

class Person{
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}