public class sample51 {
	public static void main(String[] args) {
		try {
			System.out.println("��1����:" + args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("��1�����͑��݂��Ȃ�");
		} finally {
			System.out.println("�����̏o�͏I��");
		}
	}
}

