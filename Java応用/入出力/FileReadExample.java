package Java応用.入出力;
import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/yanasekouta/Desktop/java study/Java応用/test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s + "を読み込みました。");
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
