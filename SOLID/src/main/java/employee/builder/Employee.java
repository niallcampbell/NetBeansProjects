package employee.builder;

public class Employee {
    
    private String company;
    private String name;
    private int id;
    private int salary;
    private String jobTitle;
    private String project;
    
    public void setCompany(String company) {
        this.company = company;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    public void setProject(String project) {
        this.project = project;
    }
    
    public String getCompany() {
        return company;
    }
    
    public String getName() {
        return name;
    }
    
    public int getID() {
        return id;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }
    
    public String getProject() {
        return project;
    }
    
}
