public class MathExample {
    public static void main(String[] args){
        String s1 = "こんにちは";
        String s2 = "こんにちは";

        System.out.println(s1 == s2);
        String str = "Javaの学習";
        System.out.println(str.length());
        System.out.println(str.indexOf("学習"));
        System.out.println(str.indexOf("Ruby"));
        System.out.println(str.contains("Java"));
        System.out.println(str.contains("Ruby"));
        System.out.println(str.replace("Java","Java言語"));
        String str1 = "2020/11/22";
        String[] items = str1.split("/");
        for(int i= 0;i < items.length;i++){
            System.out.println(items[i]);
        }

        System.out.println(Math.abs(-5));
        System.out.println(Math.sqrt(3.0));
        System.out.println(2 * 2* Math.PI);
        System.out.println(Math.sin(60.0 * Math.PI / 180.0));
    }
}
