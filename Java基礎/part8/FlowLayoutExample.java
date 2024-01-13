import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample extends JFrame{
    public static void main(String[] args){
        new FlowLayoutExample();
    }

    FlowLayoutExample(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(new JButton("1 JANUARY"));
        getContentPane().add(new JButton("2 FEBRUARY"));
        getContentPane().add(new JButton("3 MARCH"));
        getContentPane().add(new JButton("4 APLIL"));
        getContentPane().add(new JButton("5 MAY"));
        getContentPane().add(new JButton("6 JUNE"));
        setSize(300, 200);
        setVisible(true);
    }
}
