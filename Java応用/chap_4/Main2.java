package chap_4;

public class Main2 {
	public static void main(String[] args) throws Exception{
		System.out.println("計算を開始します");
		/*何らかの計算処理*/
		System.out.println("計算完了。結果をメモ帳で表示します");
		ProcessBuilder pb = new ProcessBuilder(
				"C:\\Windows\\WinSxS\\wow64_microsoft-windows-notepad_31bf3856ad364e35_10.0.26100.1882_none_150dac1e5480a8cf\\notepad.exe",
				"calcreport.txt"
				);
		pb.start();
	}
}
 