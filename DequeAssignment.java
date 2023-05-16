import java.util.Deque;
import java.util.LinkedList;

public class DequeAssignment {
    public static boolean isValue(String data) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : data.toCharArray()) {
            if (c == '(') {
                deque.addFirst(c);
            } else if (c == ')') {
                if (deque.isEmpty() || deque.peekFirst() != '(') {
                    return false;
                } else {
                    deque.removeFirst();
                }
            }
        }

        return deque.isEmpty();
    }

    public static void main(String[] args) {
        String data1 = "(())";
        String data2 = "(()(";
        String data3 = "(((())))";
        String data4 = "((((";

        System.out.println(isValue(data1));
        System.out.println(isValue(data2));
        System.out.println(isValue(data3));
        System.out.println(isValue(data4));
    }

}

