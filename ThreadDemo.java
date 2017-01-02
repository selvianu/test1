package file;

public class ThreadDemo {

	synchronized void printTable(int n) {// method synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				//Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread1 extends Thread {
	ThreadDemo t;

	MyThread1(ThreadDemo t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	ThreadDemo t;

	MyThread2(ThreadDemo t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}
