package day1;

public class CustomerInfo {

    // States

     private String customerName;
     private String phoneNumber;
     private String email;
     private Address cusAddress;


    public String customerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address address() {
        return cusAddress;
    }

    public void setCusAddress(Address address) {
        this.cusAddress = address;
    }
}
