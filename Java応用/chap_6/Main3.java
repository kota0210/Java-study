package chap_6;
import java.io.*;
public class Main3 {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("rpgsave,true");
			){
			fw.write('A');
			fw.flush();
		}catch(IOException e) {
			System.out.println("ファイル書き込みエラーです。");
		}
	}
}
