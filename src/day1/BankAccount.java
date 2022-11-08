package day1;

public class BankAccount {

    //States

    private String ssnNumber;
    private String accountNumber;
    private float accountBalance;
    private String accountType;  // String is class data type
    private String loanType;
    private float interestRate;
    private String bankAddress;
    private String branch;
    private int serviceFees;
    private String creditCardType;
    private CustomerInfo customerInfo;  // CustomerInfo is class data type

// Getters and Setters to access data from encapsulation

    public String getAccountNumber() {
        return accountNumber;
    }  // to allow retrieval of data

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    };  // to set/modify data

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        if(accountBalance < 0){
            throw new RuntimeException("Balance should be in positive number");
        }
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String address) {
        this.bankAddress = address;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getServiceFees() {
        return serviceFees;
    }

    public void setServiceFees(int serviceFees) {
        this.serviceFees = serviceFees;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }


    //Behaviours
    // you can create function based on your architecture

    public void transferAmount(BankAccount fromAccount, BankAccount toAccount, float amountToTransfer){
        fromAccount.setAccountBalance(fromAccount.getAccountBalance()-amountToTransfer);
        toAccount.setAccountBalance(toAccount.getAccountBalance()+amountToTransfer);

        //since it is in the same class you can do below code as wee:

        //fromAccount.accountBalance = fromAccount.accountBalance-amountToTransfer;
        //toAccount.accountBalance = toAccount.accountBalance - amountToTransfer;
    }

    public void depositAmount(BankAccount accountToDeposit, float amount){
        accountToDeposit.setAccountBalance(accountToDeposit.getAccountBalance() + amount);
        System.out.println("Account number " + accountToDeposit.getAccountNumber() + " has " + accountToDeposit.getAccountBalance());
        System.out.println("Account holder " + accountToDeposit.getCustomerInfo().getCustomerName() + " has " + accountToDeposit.getAccountBalance());
    }

    // createAccount()
    // logIn()
    // logOut()
    // closeAccount()
    // withdrawAmount()
    // totalBalance()
    // viewDetails()
    // makeTransfer()
    // depositAmount()
    // updateInfo()
    // accountAlert()
    // suspendAccount()
    // invest()
    // billPay()


}
