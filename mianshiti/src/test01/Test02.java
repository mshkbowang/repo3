package test01;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test02 {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
	
			int a=0;
			int b=1;
			int c;
			try {
				
				c=a+b;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("test1");
			}catch (Exception e) {
				System.out.println("test2");
			}finally {
				System.out.println("test03");
			}
		
			
		
	}
}
