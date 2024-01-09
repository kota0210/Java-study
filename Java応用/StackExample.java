package Java応用;
import java.util.LinkedList;
import java.util.Queue;

public class StackExample {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<String>();

        stack.push("(1)");
        System.out.println("キューの状態：" + stack);
        stack.push("(2)");
        System.out.println("キューの状態：" + stack);
        stack.push("(3)");
        System.out.println("キューの状態：" + stack);
        stack.push("(4)");
        System.out.println("キューの状態：" + stack);

        while (!stack.isEmpty()) {
            System.out.println("要素の取り出し：" + stack.pop());
            System.out.println("キューの状態：" + stack);
        }
    }
    }
