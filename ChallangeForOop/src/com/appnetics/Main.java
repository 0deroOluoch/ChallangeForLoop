package com.appnetics;

public class Main {

    public static void main(String[] args) {
	//Account account = new Account();
//	        "234787612",
//            0.00,
//            "Justin Mapesa",
//            "mapesa@justin.mapesa",
//            "(254)-725-297-723");

//        System.out.println(account.getAccountBalance());
//        System.out.println(account.getCustomerEmail());
//        System.out.println(account.getCustomerName());
//        account.deposit(5000);
//        account.withdraw(1200);
//        System.out.println(account.getAccountBalance());
//
//        Account timsAccount = new Account("Tim","tim@account.com","34540586");
//        System.out.println(timsAccount.getCustomerPhoneNumber() + " account number "+timsAccount.getAccountNumber() + "name " + timsAccount.getCustomerName());
        VipCustomer OderoVip = new VipCustomer();

        VipCustomer cineSe = new VipCustomer(3500.00,"muhkangala@makito.com");
        System.out.println(OderoVip.getCreditLimit());
        System.out.println(OderoVip.getEmail());
        System.out.println(OderoVip.getName());

        System.out.println(cineSe.getName());
        System.out.println(cineSe.getCreditLimit());

        VipCustomer mtotoMudhee = new VipCustomer("Nyako",35000,"nyakio@nyako.com");
        System.out.println(mtotoMudhee.getName());

    }
}


