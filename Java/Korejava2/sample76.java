class ExThread implements Runnable {
	public void run() {
		try {
			System.out.println("ExThread");
		}catch (Exception e) {
			System.out.println("�G���[");
		}
	}
}
public class sample76 {
	public static void main(String[] args) {
		ExThread et = new ExThread();
		Thread th = new Thread(et);
		th.start();
		try {
			Thread.sleep(500);
			System.out.println("main�X���b�h");
		}catch (Exception e) {
			System.out.println("�G���[");
		}
	}
}

