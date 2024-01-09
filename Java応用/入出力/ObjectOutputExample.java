package Java応用.入出力;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Point2 implements Serializable {
    int x;
    int y;
    Point2(int x,int y){
        this.x = x;
        this.y = y;
    }
}

class Triangle2 implements Serializable{
    Point p0;
    Point p1;
    Point p2;
}

public class ObjectOutputExample {
    public static void main(String[] args){
        Triangle tri = new Triangle();
        tri.p0 = new Point(0,0);
        tri.p1 = new Point(10,0);
        tri.p2 = new Point(5,10);

        try{
            FileOutputStream fs = new FileOutputStream("/Users/yanasekouta/Desktop/java study/Java応用/入出力/triangle.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(tri);
            os.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
