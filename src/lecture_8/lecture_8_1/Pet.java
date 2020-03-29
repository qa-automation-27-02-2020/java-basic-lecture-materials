package lecture_8.lecture_8_1;

import java.util.Objects;

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

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (obj instanceof Pet) {
//            Pet pet = (Pet) obj;
//            return pet.id == this.id &&
//                    pet.name.equals(this.name) &&
//                    pet.type.equals(this.type);
//        }
//
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getId() == pet.getId() &&
                Objects.equals(getName(), pet.getName()) &&
                Objects.equals(getType(), pet.getType()) &&
                Objects.equals(getVisitDate(), pet.getVisitDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getType(), getVisitDate());
    }
}
