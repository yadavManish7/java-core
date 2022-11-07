package day1;

public class CustomerInfo {

    // States

     private String customerName;
     private String phoneNumber;
     private String email;
     private Address cusAddress;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return cusAddress;
    }

    public void setCusAddress(Address address) {
        this.cusAddress = address;
    }
}
