package employees;

public class Manager implements Employee {
    
    private StringBuilder name = new StringBuilder();
    private final static StringBuilder jobTitle = new StringBuilder("Manager");
    
    @Override
    public void setName(StringBuilder firstName, StringBuilder secondName) {
        this.name.append(firstName).append(" ").append(secondName);
    }
    
    @Override
    public StringBuilder getName() {
        return name;
    }
    
    @Override
    public StringBuilder getJobTitle() {
        return jobTitle;
    }
    
}
