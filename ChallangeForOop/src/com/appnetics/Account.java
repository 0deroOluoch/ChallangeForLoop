package com.appnetics;

public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;
    private double depositAmount;
    private double withdrawalAmount;

    public Account(){
        this("67874884",
                50.00,
                "Default Name",
                "default email address",
                "default phone number");
        System.out.println("empty New constructor created.");
    }

    public Account(String accountNumber,double accountBalance, String customerName,String customerEmail,String customerPhoneNumber){
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("3455455",255,customerName,customerEmail,customerPhoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance= accountBalance;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }

    public double deposit(double depositAmount){
        this.depositAmount = depositAmount;
        System.out.println( "account balance before deposit is " + accountBalance);
        accountBalance+= depositAmount;
        System.out.println("account balance after " + depositAmount + " has been deposited is " + accountBalance);
        return accountBalance;
    }

    public void withdraw(double withdrawalAmount){
        this.withdrawalAmount = withdrawalAmount;

        if(withdrawalAmount >accountBalance){
            System.out.println("We are unable to process this withdrawal.Please top up to proceed. You have " + accountBalance +" in your account");
        }else{
            System.out.println("account balance before withdrawal is " + accountBalance);
            accountBalance-= withdrawalAmount;
            System.out.println("account balance after " + withdrawalAmount + " has been withdrawn is = "+ accountBalance);

        }

    }
}
