package Java基礎.part6;
//配列の各要素を５、４、３、２、１で初期化して表示
public class IntArray54321 {
    public static void main(String[] args){
        int[] a ;
        a =new int[]  {5, 4, 3, 2, 1};

        for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "] = " + a[i] );
        }
    }
}
