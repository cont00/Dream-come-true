public class Ex03 {
	public static void main(String[] args) {
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("KHN Thread start");
				for ( int i = 0; i < 1000; i++) {
					System.out.println("KHN Thread = " + i);
				}
				System.out.println("KHN Thread End");
			}
		};
		new Thread(run).start();
		new Thread(run).start();
		new Thread(run).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for ( int i = 0; i < 1000; i++) {
					System.out.println(this.toString() + " = " + i);
				}
			}
		}).start();
//		new Thread( ()->) {
//			for( int i = 0; i < 1000; i++) {
//				System.out.println("HN Thread = " + i);
//			}
//		}).start();
	} 
}