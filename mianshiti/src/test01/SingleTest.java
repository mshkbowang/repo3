package test01;

import java.io.Serializable;
import java.lang.reflect.ReflectPermission;

public class SingleTest implements Serializable {
	private SingleTest() {
//		SecurityManager manager=new SecurityManager();
//		manager.checkPermission(new ReflectPermission("禁止反射获取"));
	}
	private Object readObject() {
		return InstanceHolder.instance;
	}

	public static  SingleTest getstance() {
		return InstanceHolder.instance;
	}
	private static class InstanceHolder{
		private static SingleTest instance=new SingleTest();
	}
}
