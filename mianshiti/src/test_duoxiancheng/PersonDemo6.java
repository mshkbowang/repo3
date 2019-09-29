package test_duoxiancheng;

public class PersonDemo6 {
	public static void main(String[] args) {
	Personx p1=new Personx();
	Personx p2=new Personx("lisi");
	Personx p3=new Personx("wangwu",10);
	}
}
class Personx{
	private String name;
	private int age;
	public Personx(){
		System.out.println("A:name="+name+":age="+age);
		cry();
	}
	public Personx(String n){
		name =n;
		System.out.println("B:name="+name+":age="+age);
		cry();
	}
	public Personx(String n,int a){
		name =n;
		age=a;
		System.out.println("C:name="+name+":age="+age);
		cry();
	}
	void cry() {
		System.out.println("Cry....................");
	}
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
	
}
