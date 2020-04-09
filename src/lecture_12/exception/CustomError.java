package lecture_12.exception;

/**
 * Created by alpa on 4/9/20
 */
public class CustomError extends Error {

    public CustomError(String message) {
        super(message);
    }
}
