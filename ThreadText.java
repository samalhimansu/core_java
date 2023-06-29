public class ThreadText implements Runnable {
	public static void main(String args[]){
		ThreadText tt = new ThreadText();
		Thread t1 = new Thread(tt,"First");
		Thread t2 = new Thread(tt,"Second");
		Thread t3 = new Thread(tt,"Third");
		t1.start();
		t2.start();
		t3.start();
		}
	@Override
	public void run(){
		Thread tx = Thread.currentThread();
		String name = tx.getName();
		for(int i =1 ; i<=3 ; i++){
			System.out.println("Running Thread is :"+name+":"+i);
			try{
			Thread.sleep(1000);
			}catch(InterruptedException ie){
				}
			}
		System.out.println("Dead Thread Name is : "+Thread.currentThread().getName());
		}
	}