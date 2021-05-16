package employees;

public interface Employee {
    
    public static final StringBuilder COMPANY_NAME = new StringBuilder("Google");
    
    public abstract StringBuilder getName();
    public abstract StringBuilder getJobTitle();
    
    public abstract void setName(StringBuilder firstName, StringBuilder secondName);
    
}
