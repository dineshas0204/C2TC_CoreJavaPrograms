package prl.daynine;

public class Multithreading_threadclass_ThreadMethodsDemo {

	public static void main(String[] args) {
		Multithreading_threadclass_ChildThread threadOne = new Multithreading_threadclass_ChildThread(5, "First"); // creating child thread object
		Multithreading_threadclass_ChildThread threadTwo = new Multithreading_threadclass_ChildThread(10, "Second"); // creating child thread object
		System.out.println("Current Thread: " + Thread.currentThread());// returns current thread

		threadOne.start();
		threadTwo.start();
		Thread.currentThread().setName("Parent Thread"); // assign name to thread
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // changing priority of the thread
		System.out.println("Current Thread: " + Thread.currentThread());// returns current thread
		try {
			threadOne.join(); // wait current thread until t1 is dead
			threadTwo.join(2000); // wait current thread until t2 is dead or time period is over
		} catch (InterruptedException e) {
			System.err.println("Thread interrupted: " + e.getMessage());
		}
		System.out.println("-----------------------End of Main--------------------------");
	
	}

}
