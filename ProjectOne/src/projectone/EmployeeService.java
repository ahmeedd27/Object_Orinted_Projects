/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectone;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author computop
 */
public class EmployeeService {
    HashSet<Employee> empset=new HashSet<Employee>();
    Employee emp1=new Employee(1,"Ahmed",21,"CS",150000);
    Employee emp2=new Employee(2,"ali",33,"IT",10000);
    Employee emp3=new Employee(3,"Mohamed",25,"SE",30000);
    Employee emp4=new Employee(4,"Assem",21,"IS",2000);
   
    Scanner input=new Scanner(System.in);
    boolean found=false;
    int id;
    String name;
    int age;
    String department;
    double salary;
    
    
    public EmployeeService(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }
    
    //view all employees method
    public void viewAllEmployees(){
        for(Employee emp:empset){
            System.out.println(emp);
        }
    }
    
    
    
    //view particuler employee by given id
    public void viewEmp(){
        boolean found=false;
        System.out.println("Enter Id ");
            id=input.nextInt();
        for(Employee emp:empset){
             if(emp.getId()==id){
                System.out.println(emp);
                found=true;
             }
            
        }
            if(!found){
            System.out.println("there is no Employee with this id");
           
         }
        
       
    }
    
    
    
    //update particuler employee by given id
    public void updateEmp(){
        System.out.println("Enter id ");
        id=input.nextInt();
        for(Employee emp:empset){
           if(emp.getId()==id){
               System.out.println("Enter new name ");
               name=input.next();
               System.out.println("enter new salary");
               salary=input.nextDouble();
               emp.setName(name);
               emp.setSalary(salary);
               System.out.println("updated details are : ");
               System.out.println(emp);
               found=true;
           }
        }
        if(!found){
            System.out.println("this is id is not found");
        }else{
           System.out.println("the employee updated successfuly");
        }
    }
    
    
    
    
    //delete method
    public void deleteEmp(){
        System.out.println("Enter id ");
        id=input.nextInt();
        Employee empdelete=null;
        for(Employee emp:empset){
            if(emp.getId()==id){
                emp=empdelete;
                found=true;
            }
        }
        if(!found){
            System.out.println("the id is not exist");
        }
        else{
            empset.remove(empdelete);
            System.out.println("Employee has deleted successfully");
        }
    }
    
    
    //add employee
    public void addEmp(){
        System.out.println("enter id ");
        id=input.nextInt();
        System.out.println("enter name ");
        name=input.next();
        System.out.println("enter age ");
        age=input.nextInt();
        System.out.println("enter department ");
        department=input.next();
        System.out.println("enter salary ");
        salary=input.nextDouble();
        Employee emp=new Employee(id , name , age , department , salary);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("employee added successfully ..");
    }
    
        
}
