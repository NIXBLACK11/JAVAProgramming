import java.util.Scanner;

public class P15_Multithreading_In_Java_Using_Runnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new T11(), "T11 Thread!");
		Thread t2 = new Thread(new T22(), "T22 Thread!");
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}

class T11 implements Runnable {

	@Override
	public void run() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = obj.nextInt();

		System.out.println(a);
		System.out.println("Done with show1()!");
		obj.close();

		System.out.println(Thread.currentThread().getName());
	}
}

class T22 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i == 10) {
				try {
					Thread.sleep(100);
					System.out.println("Done with wait");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(i + "Show2()");

		}

		System.out.println(Thread.currentThread().getName());
	}
}
