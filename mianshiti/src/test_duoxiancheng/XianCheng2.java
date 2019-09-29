package test_duoxiancheng;

public class XianCheng2 {
	public static void main(String[] args) {
		SomeThread someThread=new SomeThread();
		someThread.start();
			
	
	}
}

class SomeRunnable implements Runnable{
	public void run() {
		System.out.println("hello thread");
	}
}