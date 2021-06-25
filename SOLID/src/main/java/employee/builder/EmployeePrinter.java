package employee.builder;

/**
 *  SOLID principles - single responsibility - this class is responsible for printing Employee objects
 * 
 * @author niallcampbell
 */
public class EmployeePrinter {
    
    public static void printEmployeeDetails(Employee employee) {
        
        if(employee.getCompany() != null) System.out.println("Company name: " + employee.getCompany());
        if(employee.getName() != null) System.out.println("Employee name: " + employee.getName());
        if(employee.getID() != 0) System.out.println("Employee ID: " + employee.getID());
        if(employee.getSalary() != 0) System.out.println("Employee Salary: " + employee.getSalary());
        if(employee.getJobTitle() != null) System.out.println("Employee Job Title: " + employee.getJobTitle());
        if(employee.getProject() != null) System.out.println("Project: " + employee.getProject());
    }
    
}
