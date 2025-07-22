package MiniProject;
import java.util.*;

public class EmployeeMiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID (1001 - 1007): ");
        int id = sc.nextInt();
        sc.close();
        Employee emp = new Employee();

        if (id >= 1001 && id <= 1007) {
            System.out.println("Emp No.: " + id);
            System.out.println("Emp Name: " + emp.getName(id));
            System.out.println("Department: " + emp.getDept(id));
            System.out.println("Designation: " + emp.getDesignation(id));
            System.out.println("Salary: " + emp.getSalary(id));
        } else {
            System.out.println("No employee with given emp_id");
        }
    }
}
