package prl.daynine;

public class Multithreading_threadclass_ThreadDemo {

	public static void main(String[] args) {
		Multithreading_threadclass_ChildThread threadOne = new Multithreading_threadclass_ChildThread(5, "First");
		Multithreading_threadclass_ChildThread threadTwo = new Multithreading_threadclass_ChildThread(10, "Second");

		threadOne.start();
		//threadOne.start(); // throws IllegalStateException
		// threadOne.run(); // single threaded application 
		threadTwo.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
	}


