import java.io.*;
public class sample57 {
	public static void main(String[] args) {
		try {
			BufferedWriter o =
				new BufferedWriter(new OutputStreamWriter(System.out));
			o.write("文字列");
			o.flush();
		} catch (IOException e) {
			System.out.println("出力エラー");
		}
	}
}
