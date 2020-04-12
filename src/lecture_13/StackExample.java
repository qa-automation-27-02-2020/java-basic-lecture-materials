package lecture_13;

import java.util.Stack;

/**
 * Created by alpa on 4/12/20
 */
public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Alex");
        stack.push("Bob");
        stack.push("Anna");

        String pop = stack.pop();
        System.out.println("pop: " + pop);
    }

}
