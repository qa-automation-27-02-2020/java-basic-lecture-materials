package lecture_3;

/**
 * Created by alpa on 3/5/20
 */
public class TernaryOperator {

    public static void main(String[] args) {
//        String name = "John Snow";
        String name = "Sticky";
        String result = "";

//        if (name == "John Snow") {
//            result = name + " boyfriend of Mother of Dragon";
//        } else {
//            result = "LOOOOSSSSSEEEERRRR!";
//        }

        result = name == "John Snow" ? name + " boyfriend of Mother of Dragon" : "LOOOOSSSSSEEEERRRR!";

        System.out.println(result);
    }
}
