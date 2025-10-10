import java.util.*;

public class ReverseStack {
    // Push an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int current) {
        if (s.isEmpty()) {
            s.push(current);
            return;
        }

        int top = s.pop();               // pop top element
        pushAtBottom(s, current);        // push current to bottom
        s.push(top);                     // put top back
    }

    // Reverse the stack recursively
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) return;

        int top = s.pop();               // remove top
        reverse(s);                      // reverse remaining stack
        pushAtBottom(s, top);            // push current element at bottom
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
