public class sample51 {
	public static void main(String[] args) {
		try {
			System.out.println("第1引数:" + args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("第1引数は存在しない");
		} finally {
			System.out.println("引数の出力終了");
		}
	}
}

