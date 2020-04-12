package lecture_13;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by alpa on 4/12/20
 */
public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alex");
        queue.add("Bob");
        queue.add("Ana");
        queue.add("John");

        System.out.println(queue);

        String poll = queue.poll();
        System.out.println("poll: " + poll);
        System.out.println(queue);

        String peek = queue.peek();
        System.out.println("peek: " + peek);
        System.out.println(queue);

        System.out.println("remove: " + queue.remove());
    }
}
