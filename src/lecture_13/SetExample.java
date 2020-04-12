package lecture_13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by alpa on 4/12/20
 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Alex");
        stringSet.add("Bob");
        stringSet.add("Ana");
        stringSet.add("John");
        stringSet.add("Viktor");

        System.out.println(stringSet);

        Iterator<String> iterator = stringSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
