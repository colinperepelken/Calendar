package bernard.colin.calendar;

import java.util.ArrayList;

public class EmployeeManager {
    protected static ArrayList<Employee> employees;
    
    // init list of employees
    protected static void initEmployees() {
    	employees = new ArrayList<Employee>();
    	employees.add(new Employee("Colin", "Bernard", 76823));
    	employees.add(new Employee("Kym", "Hays", 892348));
    	employees.add(new Employee("Gary", "Garcha", 768778));
    	employees.add(new Employee("Gary", "Nixon", 69742));
    	employees.add(new Employee("Andrew", "lastname", 18934));
    	employees.add(new Employee("Catherine", "lastname", 347833));
    }
}
