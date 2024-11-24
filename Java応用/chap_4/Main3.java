package chap_4;
import java.util.*;
public class Main3 {
	public static void main(String[] args) {
		System.out.println("利用中のJavaのバージョン:");
		System.out .println(System.getProperty("Java.version"));
		
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("システムプロパティ一覧:");
		while(i.hasNext()) {
			String key = i.next();
			System.out.print(key + "=");
			System.out.println(System.getProperty(key));
		}
	}
}
