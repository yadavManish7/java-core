package day1;

public class BankingApplication {
    public static void main(String[] args) {   // application class contains main method

        BankAccount manishAccount = new BankAccount(); // creating object using new keyword
        manishAccount.setAccountNumber("234384893924"); // manishAccount is implicit parameter, 234384.. is explicit parameter
        manishAccount.setAccountBalance(5000f);
        manishAccount.setBankAddress("2147 Northgate Rd, Irving,TX");
        manishAccount.setServiceFees(10);
        manishAccount.setAccountType(AccountType.FIXED_DEPOSIT);

        CustomerInfo manishInfo = new CustomerInfo();  // creating obj of custom datatype to store values for variables
        manishInfo.setCustomerName("Manish Yadav");
        manishInfo.setEmail("customer1@gmail.com");
        manishInfo.setPhoneNumber("234339458");
        manishAccount.setCustomerInfo(manishInfo);// Inserting customerInfo obj value into account obj.


        Address cusAddress = new Address();   // creating Address Obj to set variable values
        cusAddress.setStreetAddress("117 Decatur Ave");
        cusAddress.setAreaZipCode("89743");
        cusAddress.setState("Texas");
        cusAddress.setCity("Denton");

        manishInfo.setCusAddress(cusAddress);  // inserting cusAddress obj value into CustomerInfo obj.

        System.out.println("****Manish Account****");
        System.out.println("Account number : " + manishAccount.getAccountNumber());
        System.out.println("Account name : " + manishInfo.getCustomerName());
        // System.out.println(manishAccount.customerInfo().getCustomerName());  // BankAcc Obj -> get method -> variable data
        System.out.println("Customer contact : " + manishInfo.getPhoneNumber());
        System.out.println("Customer address : " + cusAddress.getStreetAddress());
        System.out.println("Account balance : " + manishAccount.getAccountBalance());
        System.out.println();

        BankAccount mikeAccount = new BankAccount();
        mikeAccount.setAccountNumber("122345763398");
        mikeAccount.setAccountBalance(4000f);

        CustomerInfo mikeInfo = new CustomerInfo();
        mikeInfo.setCustomerName("Mike");
        mikeInfo.setPhoneNumber("2349584504");

        mikeAccount.setCustomerInfo(mikeInfo);

        Address mikeAddress = new Address();
        mikeAddress.setStreetAddress("234 Bell Ave");
        mikeAddress.setState("NY");

        mikeInfo.setCusAddress(mikeAddress);

        System.out.println("******Mike Account*****");
        System.out.println("Account number : " + mikeAccount.getAccountNumber());
        System.out.println("Customer address : " + mikeAddress.getStreetAddress());
        System.out.println("Customer name : " + mikeInfo.getCustomerName());
        System.out.println("Account Balance : " + mikeAccount.getAccountBalance());
        System.out.println();

        //without function or abstraction
        System.out.println("***without function demo****");

        float amountToTransfer = 500f;
        manishAccount.setAccountBalance(manishAccount.getAccountBalance()-amountToTransfer);
        mikeAccount.setAccountBalance(mikeAccount.getAccountBalance()+amountToTransfer);

        System.out.println("Manish account balance : " + manishAccount.getAccountBalance());
        System.out.println("Mike account balance : " + mikeAccount.getAccountBalance());
        System.out.println();

        System.out.println("with function");

       // BankAccount dummyAcc = new BankAccount(); //to call a function inside a class, you need to create an object
        manishAccount.transferAmount(mikeAccount,500f);//manishAccount is implicit parameter
        System.out.println("Manish account balance : " + manishAccount.getAccountBalance());
        System.out.println("Mike account balance : " + mikeAccount.getAccountBalance());
        System.out.println();

        manishAccount.depositAmount(2000f);



    }
}
