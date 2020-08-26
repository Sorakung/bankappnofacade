/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcustomers;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;
/**
 *
 * @author sarun
 */
public class Facade {
    private static Facade FObj = null;
    ArrayList<CustomerIf> cuslist = new ArrayList();
    private Facade(ArrayList<CustomerIf> cust) {
        cuslist = cust;
    }
    public static Facade getMyFacadeObject(ArrayList<CustomerIf> cuslist) {
        if (FObj == null) {
            FObj = new Facade(cuslist);
        } 
        return FObj;
    }
    public void doDeposit(double amt, CustomerIf cust, int accNo){
        AccountIf acc = cust.getAccount(accNo);
        acc.deposit(amt);
    }
    
    public void getBankAccount(CustomerIf cust, int accNo){
        AccountIf acc = cust.getAccount(accNo);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
    }
    
    public void getBankCustomer(String custName){
        
    }
}
