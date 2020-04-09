package lecture_12;

/**
 * Created by alpa on 4/9/20
 */
public enum Role {

    ADMIN(0), GUEST(1), AUTH(2);

    private int permission;

    private Role(int permission) {
        this.permission = permission;
    }

    public int getPermission() {
        return permission;
    }
}
