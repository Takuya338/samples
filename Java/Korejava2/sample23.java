public class sample23{
	public static void main(String[] args) {
		int i;
		for(i = 0; i < args.length; i++) {
			if(args[i].equals("skip")) { continue; } //���̌J��Ԃ���
			System.out.println("��" + (i+1) + "����:" + args[i]);
			if(args[i].equals("end")) { break; } //�J��Ԃ����I��
			}
	}
}
