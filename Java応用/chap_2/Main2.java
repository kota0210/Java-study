package chap_2;
import java.util.*;

public class Main2 {
	public static Optional<String> decorate(String s, char c){
		String r;
		if (s == null || s.length() == 0) {
			r = null;
		}else {
			r = c + s+ c;
		}
		return Optional.ofNullable(r);
	}
	
	public static void main(String[] args) {
		Optional<String> s= decorate("",'★');
		System.out.println(s.orElse("nullのためしょりできません"));
	}
}
