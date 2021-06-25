package employee.builder;

/**
 *  Simple builder class for creating an employee object. 
 * 
 *  Rather than creating a number of constructors for the Employee class, we will use a builder
 *      where the client can set whichever properties they wish. 
 * 
 * @author niallcampbell
 */
public class EmployeeBuilder {
    
    private Employee employee;
    
    public EmployeeBuilder createEmployee() {
        employee = new Employee();
        return this;
    }
    
    public EmployeeBuilder buildCompany(String company) {
        employee.setCompany(company);
        return this;
    }
    
    public EmployeeBuilder buildName(String name) {
        employee.setName(name);
        return this;
    }
    
    public EmployeeBuilder buildID(int id) {
        employee.setID(id);
        return this;
    }
    
    public EmployeeBuilder buildSalary(int salary) {
        employee.setSalary(salary);
        return this;
    }
    
    public EmployeeBuilder buildJobTitle(String jobTitle) {
        employee.setJobTitle(jobTitle);
        return this;
    }
    
    public EmployeeBuilder buildProject(String project) {
        employee.setProject(project);
        return this;
    }
    
    public Employee getEmployee() {
        return employee;
    }
    
}
