package lecture_8.lecture_8_1;

/**
 * Created by alpa on 3/26/20
 */
public class Pet {

    private int id;
    private String name;
    private String type;
    private String visitDate;

    public Pet(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }


    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", visitDate='" + visitDate + '\'' +
                '}';
    }
}
