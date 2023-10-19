package runemployee;
import java.util.*;

// author sollano_jhaynefe

class Employee {
    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;
    
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    
    public double getMonthlySalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double ratePerHour;
    private double wage;
    private int hoursWorked;
    
    public void setWage(double ratePerHour, int hoursWorked){
    this.ratePerHour = ratePerHour;
    this.hoursWorked = hoursWorked;
    }
    
    public double getWage(){
        wage = ratePerHour * hoursWorked;
        return wage;
    }
}

public class RunEmployee {
    public static void main(String[] args) {
        
        Scanner jgs = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = jgs.nextLine();
        System.out.println("Press F for Full Time or P for Part Time.");
        char press = jgs.next().charAt(0);
            
            if (press == 'F' || press == 'f'){
                System.out.println("Enter monthly salary: ");
                double ms = jgs.nextDouble();
                
                FullTimeEmployee fte = new FullTimeEmployee();
                fte.setName(name);
                fte.setMonthlySalary(ms);
                
                System.out.println("Name: " + fte.getName());
                System.out.println("Monthly Salary: " + fte.getMonthlySalary());
            }
            else if (press == 'P' || press == 'p'){
                System.out.println("Enter rate per hour and no. of " +
                                  "hours worked separated by space: ");
                System.out.println("Sample: 107.50 13");
                double rh = jgs.nextDouble();
                int hw = jgs.nextInt();
                
                PartTimeEmployee pte = new PartTimeEmployee();
                pte.setName(name);
                pte.setWage(rh, hw);
                
                System.out.println("Name: " + pte.getName());
                System.out.println("Wage: " + pte.getWage());
            }
            else {
                System.out.println("Enter only P or F.");
            }
      jgs.close();  
    }
}
