package lecture_11;

/**
 * Created by alpa on 4/5/20
 */
public class EmployeesFactory {

    public Employee createEmployee(String job) {
        switch (job) {
            case "back_dev": return new BackendDeveloper();
            case "front_dev": return new FrontendDeveloper();
            case "manual_qa": return new ManualQA();
            case "auto_qa": return new AutoQA();
            case "pm": return new ProjectManager();
            default: return null;
        }
    }
}
