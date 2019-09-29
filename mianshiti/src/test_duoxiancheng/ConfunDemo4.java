package test_duoxiancheng;


public class ConfunDemo4 {
	    public static void main(String[] args) {
	    	PersonDemo2 s=new PersonDemo2("王五",19);
	            s.setName("李五");                            //对象建立后，想变更值时，就要用set/get方法，重新设置新的值
	            s.setName("阿尔法狗");                        //并可调用对象多次。
	           System.out.println(s);
	    }
	}
class PersonDemo2{
	    private String name;
	    private int age;
		public PersonDemo2(String name, int age) {
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
			return "PersonDemo [name=" + name + ", age=" + age + "]";
		}
	   
	    
		
}
