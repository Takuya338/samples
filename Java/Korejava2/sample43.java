class Test {
	void printString(String str) {
		System.out.println("Test�N���X�F" + str);
	}
}
class ExTest extends Test{
	void printString(String str) {
		System.out.println("ExTest�N���X�F" + str);
	}
	void printStr(String str) {
		super.printString(str);
	}
}
public class sample43 {
	public static void main(String[] args) {
        ExTest ex_test = new ExTest();
		ex_test.printStr("������");
	}
}
