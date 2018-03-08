package ResChain;

/**
 * Created by Blue on 2018/3/8.
 */
public class Client {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager(3);
        GeneralManager generalManager = new GeneralManager(5);
        DepartmentManager departmentManager = new DepartmentManager(10);

        projectManager.setHandler(generalManager);
        generalManager.setHandler(departmentManager);
        projectManager.handleRequest(4);
    }
}
