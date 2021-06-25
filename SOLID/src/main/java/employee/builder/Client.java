package employee.builder;

public class Client {
    
    public static void main(String [] args) {
        
        Employee softwareEngineer = new EmployeeBuilder().createEmployee().buildCompany("Facebook")
                .buildName("John Smith").buildID(2536).buildJobTitle("Software Engineer")
                    .getEmployee();
        
        EmployeePrinter.printEmployeeDetails(softwareEngineer);
        
        System.out.println();
        
        Employee scrumManager = new EmployeeBuilder().createEmployee().buildCompany("Google").buildName("Jack Doe")
                .buildJobTitle("Scrum Manager").buildSalary(56000).getEmployee();
        
        EmployeePrinter.printEmployeeDetails(scrumManager);
        
    }
    
}
