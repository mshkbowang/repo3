package test01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test04 {
public static void main(String[] args) throws IllegalAccessException,InvocationTargetException, InstantiationException, IllegalArgumentException, NoSuchMethodException, SecurityException{
	try {
		test();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}

private static void test() throws IOException,ClassNotFoundException{
	SingleTest instance=SingleTest.getstance();
	ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("t.text"));
	out.writeObject(instance);
	out.close();
	ObjectInputStream in =new ObjectInputStream(new FileInputStream("t.text"));
	SingleTest singleTest=(SingleTest)in.readObject();
	System.out.println(instance);
	System.out.println(singleTest);
}
}
