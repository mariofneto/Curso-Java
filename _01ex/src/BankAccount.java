import java.util.Scanner;

public class BankAccount {
    final private int numAccount;
    private String name;
    private double deposit;

    BankAccount(int numAccount, String name){
        this.numAccount = numAccount;
        this.name = name;
    }

    BankAccount(int numAccount, String name, double depositInitial){
        this.numAccount = numAccount;
        this.name = name;
        deposit(depositInitial);
    }

    public int getNumAccount(){
        return numAccount;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getDeposit(){
        return deposit;
    }

    // deposit e withdraw

    public void deposit(double deposit){
        this.deposit += deposit;
    }

    public void withdraw(double value){
        this.deposit -= value + 5.00;
    }

    @Override
    public String toString(){
        return  "Account " +
                numAccount +
                "," +
                "Holder: " +
                name +
                "," +
                "Balance: $ "
                + String.format("%.2f%n", deposit);
    }



}
