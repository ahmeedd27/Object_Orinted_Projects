
package projectone;

import java.util.Scanner;


public class ProjectOne {

   static boolean ordering=true;
   static void menu(){
       System.out.println("*****************welcome to management system******************" 
                             +"\n1. Add employee "
                             + "\n2.View Employee"
        		     + "\n3.Update Employee"
        		     + "\n4. Delete Employee"
        		     + "\n5.View All Employee"
        		     + "\n6. Exist ");
   }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice;
        EmployeeService empse=new EmployeeService();
        do{ 
            menu();
            System.out.println("SELECT YOUR CHOICE ");
            choice=input.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("add employee");
                    empse.addEmp();
                    break;
                }
                 case 2:{
                    System.out.println("view employee");
                    empse.viewEmp();
                    break;
                }
                  case 3:{
                    System.out.println("update employee");
                    empse.updateEmp();
                    break;
                }
                   case 4:{
                    System.out.println("delete employee");
                    empse.deleteEmp();
                    break;
                }
                    case 5:{
                    System.out.println("view all employee");
                    empse.viewAllEmployees();
                    break;
                }
                    case 6:{
                    System.out.println("thanks for using our system");
                    System.exit(0);
                   
                }
                    default:System.out.println("invalid number");
            }
            
            
            
        }while(ordering);
       
    }
    }
    

