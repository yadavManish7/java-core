package day1;

public class Address {

     private String streetAddress;
     private String areaZipCode;
     private String state;
     private String city;

    public String streetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String areaZipCode() {
        return areaZipCode;
    }

    public void setAreaZipCode(String areaZipCode) {
        this.areaZipCode = areaZipCode;
    }

    public String state() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String city() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
