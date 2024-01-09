package Java基礎.part2;

public class rennsyuu {
    public static void main(String[] args){
        int x = 0;
        int y = 3;
        if(y > 2){
            x = ++y;
            y = x + 5;
        }else {
            y++;
        }
        System.out.println(x + "," + y);
    }
}
