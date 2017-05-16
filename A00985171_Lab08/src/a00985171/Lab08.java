package a00985171;

/**
 * Lab08.java
 * Mar 8, 2017
 * @author bruna - A00985171
 * 
 */

public class Lab08 implements Runnable {
	
	private Thread tortoise, hare;
	private static int LIMIT = 100;
	private static boolean start = false;
	private static boolean finish = false;
	private Object sync = new Object();
	private int distance = 0;
			
	public Lab08() {	
		
		tortoise = new Thread(this, "Tortoise");
		hare = new Thread(this, "Hare");

		tortoise.start();
		hare.start();
	}
		/**
		 * Reports the race progress.
		 * With each iteration the accumulated sum for each thread is displayed.
		 * When one of the Threads reaches or surpasses 100 the program reports who 
		 * the winner is and then stops.
		 */
		public void report() {
			String runnerName = Thread.currentThread().getName();
			start = !start;
			if (start) {
				System.out.println();
			}
			 System.out.print( runnerName + " " + distance + "\t "   );
			
			if (distance >= LIMIT) {
				finish = true;
				System.out.println();
				System.out.println("--------------------------");
				System.out.println( runnerName + " WINS!!!");
			}
		}
		
		/**
		 * Random numbers between 1 and 5 are generated and accumulated here.
		 * Each thread should also be made to sleep so we can follow the program flow.
		 * Progress is displayed with each iteration by calling the report() method.
		 */
		@Override
		public void run() {
			while (distance < LIMIT || !finish) {
				try {
					synchronized (sync) {
						distance = distance + randomInteger(1, 5);
						Thread.sleep(200);
						sync.notify();
						if (!finish) {
							report();
							sync.wait();
						}
					}
				} catch (final InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	public static int randomInteger(int min, int max) {
		int randomNum = min + (int) (Math.random() * ((max - min) + 1));
		return randomNum;
	}
	
	public static void main(String args[]) {
		System.out.println(" The Great Race");
		System.out.println("Tortoise vs. Hare");
		System.out.println("------------------");
		
		new Lab08();
		}
	}
