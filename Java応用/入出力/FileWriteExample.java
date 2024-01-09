package Java応用.入出力;
import java.io.*;
public class FileWriteExample {
    public static void main(String[] args){
        try{
            File file = new File("/Users/yanasekouta/Desktop/java study/Java応用/test.txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0 ; i < 5;i++){
                bw.write("[" + i + "]");
                bw.newLine();
            }
            bw.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
