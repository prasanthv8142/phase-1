package assignedProjects;


	class MyThread1 implements Runnable{

		
		public void run() {
			System.out.println("Hello All..");
			
		}
		
	}
	public class ThreadRunnable {

		public static void main(String[] args) {
		Thread t=new Thread(new MyThread1());
		t.start();
		System.out.println("main method");
		}

	}

