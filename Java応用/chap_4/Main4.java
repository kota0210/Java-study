package chap_4;
import java.util.*;
import java.text.*;
public class Main4 {
	public static  void main(String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry() + "-" + loc.getLanguage());
		String now = (new SimpleDateFormat()).format(new Date());
		if(loc.getLanguage().equals("ja")) {
			System.out.println("現在の時刻は" +now);
		}else {
			System.out.println("Current time is" +now);
		}
	}
}
