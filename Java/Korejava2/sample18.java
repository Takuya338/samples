public class sample18 {
	public static void main(String[] args) {
		int i = (int)(Math.random() * 10);
		int amari = i % 3;
		switch (amari) {
		case 0: System.out.println("乱数" + i + "は3の倍数です。");
			break;
		case 1: System.out.println("乱数" + i + "は3の倍数+1です。");
			break;
		case 2: System.out.println("乱数" + i + "は3の倍数+2です。");
			break;
		default:break;
		}
	}
}
