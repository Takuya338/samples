public class sample26 {
	public static void main(String[] args) {
		int i = 0;
		while ((i < args.length) &&
					 !args[i].equals("end")) {
			System.out.println("��" + (i+1) + "����:" + args[i]);
			i++;
		}
}
}