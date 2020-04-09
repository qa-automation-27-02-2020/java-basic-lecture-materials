package lecture_12.exception;

/**
 * Created by alpa on 4/9/20
 */
public class ErrorExample {

    public static void main(String[] args) {
        String name = null;


        try {
            if (name == null) {
                throw new CustomError("Name is NULL!");
            }
        } catch (CustomError error) {
            error.printStackTrace();

        }


        System.out.println("sdfsfsfsdf");
    }
}
