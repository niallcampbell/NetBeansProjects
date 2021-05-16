package office;

import employees.*;

import java.util.ArrayList;

public class Staff {
    
    final static ArrayList<Employee> staff = new ArrayList<>();
    
    public static void main(String [] args) {
    
       Manager manager = new Manager();
       manager.setName(new StringBuilder("John"), new StringBuilder("Smith"));
       staff.add(manager);
       
       SoftwareEngineer softwareEngineer = new SoftwareEngineer();
       softwareEngineer.setName(new StringBuilder("Niall"), new StringBuilder("Campbell"));
       staff.add(softwareEngineer);
       
       System.out.println("Company: " + Employee.COMPANY_NAME);
       System.out.println();
       System.out.println("Staff:");
       System.out.println();
       
       for(Employee e : staff) {
           System.out.println(e.getName());
           System.out.println(e.getJobTitle());
           System.out.println();
       }
    }
    
}
