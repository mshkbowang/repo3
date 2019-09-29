package test_duoxiancheng;

import java.util.zip.ZipEntry;

/**
 * 有参构造函数
 * @author bbk
 *
 */
public class PersonDemo{
	public static void main(String[] args) {
		Person p=new Person("lisi",19);
		System.out.println(p+"^#$%");
		p.show();
	}
}
class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public void show() {
		System.out.println(name+"\n"+age);
	}
	

}
