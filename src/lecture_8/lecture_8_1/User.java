package lecture_8.lecture_8_1;

/**
 * Created by alpa on 3/26/20
 */
public class User {

    String userName;
    int age;
    int yearsOfExp;
    String email;

    public User() { }

    public User(String userName, int age, String email) {
        this.userName = userName;
        this.age = age;
        this.email = email;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String email, int yearsOfExp) {
        this.userName = userName;
        this.email = email;
    }


    public void printEmail() {
        System.out.println("User email: " + email);
    }

    public boolean isAdult() {
        return age >= 18;
    }


    private void showInfo() {

    }

}
