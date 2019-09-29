
package test_duoxiancheng;

import javax.xml.stream.events.StartDocument;

public class XianCheng5 {
	public static void main(String[] args) {
		new MyThread01("低级",1).start();
		new MyThread01("中级",5).start();
		new MyThread01("高级",10).start();

	}
}
class MyThread01 extends Thread{
	public MyThread01(String name,int pro) {
		super(name);//设置线程的名称
		this.setPriority(pro);//设置
	}
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(this.getName()+"线程第"+i+"次执行!");
			if(i%5==0) {
				Thread.yield();
			}
		}
	}
}
