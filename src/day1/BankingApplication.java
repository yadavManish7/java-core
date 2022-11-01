package day1;

public class BankingApplication {
    public static void main(String[] args) {   // application class contains main method

        BankAccount accountObj = new BankAccount(); // creating object using new keyword

        // accountObj.accountNumber = "452801100230304";
        accountObj.setAccountNumber("234384893924");

        //  String accountNum = accountObj.accountNumber;
        String accountNum = accountObj.getAccountNumber();

        //accountObj.accountBalance = 40030f;
        accountObj.setAccountBalance(50000f);

        //accountObj.address = "2147 Northgate Rd, Irving,TX";
        accountObj.setBankAddress("2147 Northgate Rd, Irving,TX");

        //accountObj.serviceFees = 10;
        accountObj.setServiceFees(10);

        CustomerInfo accountObjInfo = new CustomerInfo();  // creating obj of custom datatype to store values for variables
        //accountObjInfo.customerName = "Mike John";
        accountObjInfo.setCustomerName("Mike John");

        // accountObjInfo.email = "customer1@gmail.com";
        accountObjInfo.setEmail("customer1@gmail.com");

        //accountObjInfo.phoneNumber = "23434323456";
        accountObjInfo.setPhoneNumber("234339458");

        //accountObj.customerInfo = accountObjInfo;  // Inserting customerInfo obj value into account obj.
        accountObj.setCustomerInfo(accountObjInfo);

        Address cusAddress = new Address();   // creating Address Obj to set variable values
        cusAddress.setStreetAddress("117 Decatur Ave");
        cusAddress.setAreaZipCode("89743");
        cusAddress.setState("Texas");
        cusAddress.setCity("Denton");

        accountObjInfo.setCusAddress(cusAddress);  // inserting cusAddress obj value into CustomerInfo obj.

    }
}
