import java.io.*;
public class sample60 {
	public static void main(String[] args) {
		try {
			FileWriter out =
				new FileWriter("test.txt");
			out.write("あいうえお");
			out.close();
		} catch (IOException e) {
			System.out.println("出力エラー");
		}
	}
}
