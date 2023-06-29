public class ThreadText1 extends Thread {
	public void run() {
		Thread tt = Thread.currentThread();
		String name = tt.getName();
		for(int i = 1 ; i<=3 ; i++) {
			System.out.println("Running Thread is : "+name+" : "+i);
			try{
			Thread.sleep(1000);
			}catch(InterruptedException ie) {
				}
			}
		System.out.println("Dead Thread name is : "+Thread.currentThread().getName());
		}
	public static void main(String args[]) {
		ThreadText1 t1 = new ThreadText1("First");
		ThreadText1 t2 = new ThreadText1("Second");
		ThreadText1 t3 = new ThreadText1("Third");
		}
	public ThreadText1(String name) {
		super(name);
			//    start();
			}
		}