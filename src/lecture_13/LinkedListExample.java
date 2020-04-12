package lecture_13;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by alpa on 4/12/20
 */
public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alex");
        linkedList.add("Bob");
        linkedList.add("Ana");
        linkedList.add("John");

        System.out.println(linkedList.size());
        System.out.println(linkedList.get(2));

        String first = linkedList.getFirst();
        System.out.println("first: " + first);

        String last = linkedList.getLast();
        System.out.println("last: " + last);

        String remove = linkedList.remove();
        System.out.println("remove: " + remove);

        linkedList.remove(2); // 1 -> <-2-> <-4


//        String peek = linkedList.peek();
//        System.out.println("peek: " + peek);

    }
}
