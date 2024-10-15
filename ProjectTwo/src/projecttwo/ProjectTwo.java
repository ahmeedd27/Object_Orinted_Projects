
package projecttwo;

import java.util.Scanner;


public class ProjectTwo {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        AtmInterface myref=new AtmInterfaceImpl();
        int password=12;
        int accnum=12;
        System.out.println("***************WELCOME TO OUR ATM MACHINE SYSTEM*************");
        System.out.println("Enter your password");
        int pass=input.nextInt();
        System.out.println("Enter your Acc Number");
        int acc=input.nextInt();
        do{
            if( (password==pass) && (accnum==acc)){
            System.out.println("1. chack balance \n2. withdrow \n3. Deposite \n4. miniStatement \n5. exit");
            System.out.println(" ");
            System.out.println("Enter your choice ");
            int choice=input.nextInt();
            if(choice==1){
                myref.viewBalance();
            }
            else if(choice==2){
                System.out.println("Enter your withdraw amount : ");
                double wa=input.nextDouble();
                myref.withdraw(wa);
            }
            else if(choice==3){
                System.out.println("Enter your deposite amount : ");
                double da=input.nextDouble();
                myref.deposite(da);
            }
            else if(choice==4){
                myref.viewMiniStatement();
            }
            else if(choice==5){
                System.out.println("thanks for using our ATM Machine.\nclloect your atm card.");
                System.exit(0);
            }
            else {
                System.out.println("Not Valid Choice");
            }
        }
        else{
            System.out.println("invalid password or account_number");
            System.exit(0);
        }}while(true);
       
    }
    
}
