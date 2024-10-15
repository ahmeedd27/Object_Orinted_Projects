/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecttwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author computop
 */
public class AtmInterfaceImpl implements AtmInterface{
    Atm a=new Atm();
    Map<Double , String> minist=new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("your balance : "+ a.getBalance());
    }

    @Override
    public void withdraw(double withdrawAmount) {
        
       if(withdrawAmount%50==0){
           if(withdrawAmount<=a.getBalance()){
               minist.put(withdrawAmount, " the withdraw amount that you take ");
            System.out.println("you successfully withdrawed : "+withdrawAmount);
            a.setBalance(a.getBalance() - withdrawAmount);
            viewBalance();
}
        else{
            System.out.println("the amount that you entered is not valid");
        }
       }
       else{
           System.out.println("Can not deal with (10 , 20 , 30 , 40)");
       }
        
    }

    @Override
    public void deposite(double depositeAmount) {
        
        
             minist.put(depositeAmount, " the deposite amount that you deposite ");
             System.out.println("Your Deposite Amount is : "+depositeAmount);
            a.setBalance(a.getBalance() +depositeAmount);
            viewBalance();
     
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m:minist.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }

}
