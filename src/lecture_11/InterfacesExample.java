package lecture_11;

/**
 * Created by alpa on 4/4/20
 */
public class InterfacesExample {

    public static void main(String[] args) {

        EmployeesFactory employeesFactory = new EmployeesFactory();
        Employee developer = employeesFactory.createEmployee("back_dev");
        developer.doWork();

        Employee frontendDeveloper = employeesFactory.createEmployee("front_dev");
        frontendDeveloper.doWork();

        ManualQA manualQa = (ManualQA) employeesFactory.createEmployee("manual_qa");
        manualQa.doWork();
//
        AutoQA autoQA = (AutoQA) employeesFactory.createEmployee("auto_qa");
        autoQA.doWork();

        ProjectManager projectManager = (ProjectManager) employeesFactory.createEmployee("pm");
        projectManager.doWork();
        projectManager.showFoundedBugInfo(manualQa);
        projectManager.showFoundedBugInfo(autoQA);
    }

}
