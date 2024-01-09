package Java応用;
import java.util.HashSet;
public class SetExample {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        System.out.println(set.add("jan"));
        System.out.println(set.add("Feb"));
        System.out.println(set.add("Feb"));
        System.out.println(set.add("Mar"));
        System.out.println(set.add("Apr"));

        System.out.println(set);
        System.out.println(set.contains("jan"));
        System.out.println(set.contains("Jun"));
    }
}
