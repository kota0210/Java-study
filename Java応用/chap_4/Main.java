package chap_4;

public class Main {
	public static void main(String[] args) {
		/*何らかのデータを読み込む処理*/
		boolean isErr = true;
		if (isErr) {
			System.out.println("データが壊れています。以上終了します。");
			System.exit(1);
		}
		System.out.println("正常終了しました。");
	}
}
