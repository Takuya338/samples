public class sample23{
	public static void main(String[] args) {
		int i;
		for(i = 0; i < args.length; i++) {
			if(args[i].equals("skip")) { continue; } //次の繰り返しへ
			System.out.println("第" + (i+1) + "引数:" + args[i]);
			if(args[i].equals("end")) { break; } //繰り返しを終了
			}
	}
}
