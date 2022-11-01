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

    public float accountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        if(accountBalance < 0){
            throw new RuntimeException("Balance should be in positive number");
        }
        this.accountBalance = accountBalance;
    }

    public String accountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String loanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public float interestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String BankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String address) {
        this.bankAddress = address;
    }

    public String branch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int serviceFees() {
        return serviceFees;
    }

    public void setServiceFees(int serviceFees) {
        this.serviceFees = serviceFees;
    }

    public String creditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public CustomerInfo customerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }


    //Behaviours

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
