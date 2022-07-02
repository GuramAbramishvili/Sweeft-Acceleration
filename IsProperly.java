import java.util.ArrayDeque;
import java.util.Deque;

public class IsProperly {

    public static void main(String[] args) {
        System.out.println(isProperly("(()))))"));
    }

    static boolean isProperly(String sequence) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < sequence.length(); i++) {
            char x = sequence.charAt(i);

            if (x == '(') {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            if (x == ')') {
                stack.pop();
            }
        }
        return (stack.isEmpty());
    }

}
