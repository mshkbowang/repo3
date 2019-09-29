package test_duoxiancheng;

public class XianCheng4 {
public static void main(String[] args) throws InterruptedException {
	System.out.println(Thread.currentThread().getName());
	MyThread myThread=new MyThread();
	myThread.start();
	myThread.sleep(1000);//这里sleep的就是主线程，而非myThread线程
	Thread.sleep(10);
	for(int i=0;i<100;i++) {
		System.out.println("main"+i);
	}
}
}
