package day1;

public class BankingApplication {
    public static void main(String[] args) {   // application class contains main method

        BankAccount manishAccount = new BankAccount(); // creating object using new keyword

        // manishAccount.accountNumber = "452801100230304";
        manishAccount.setAccountNumber("234384893924");
        //  String accountNum = manishAccount.accountNumber;
        String accountNum = manishAccount.getAccountNumber();
        // System.out.println(accountNum);
        //manishAccount.accountBalance = 40030f;
        manishAccount.setAccountBalance(5000f);
        //manishAccount.address = "2147 Northgate Rd, Irving,TX";
        manishAccount.setBankAddress("2147 Northgate Rd, Irving,TX");
        //manishAccount.serviceFees = 10;
        manishAccount.setServiceFees(10);
        CustomerInfo manishInfo = new CustomerInfo();  // creating obj of custom datatype to store values for variables
        //accountObjInfo.customerName = "Mike John";
        manishInfo.setCustomerName("Manish Yadav");
        // accountObjInfo.email = "customer1@gmail.com";
        manishInfo.setEmail("customer1@gmail.com");
        //accountObjInfo.phoneNumber = "23434323456";
        manishInfo.setPhoneNumber("234339458");
        //manishAccount.customerInfo = accountObjInfo;  // Inserting customerInfo obj value into account obj.
        manishAccount.setCustomerInfo(manishInfo);


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


    }
}
