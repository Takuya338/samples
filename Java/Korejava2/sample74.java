class ExThread extends Thread {
	public void run() {
		try {
			System.out.println("ExThread");
		}catch (Exception e) {
			System.out.println("�G���[");
		}
	}
}
public class sample74 {
	public static void main(String[] args) {
		ExThread et = new ExThread();
		et.start();
		try {
			System.out.println("main�X���b�h");
		}catch (Exception e) {
			System.out.println("�G���[");
		}
	}
}
