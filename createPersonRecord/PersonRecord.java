package edu.cscc;
public class PersonRecord {


    private Address address;
    private PersonName personName;
    private PhoneNumber phoneNumber;
    private String email;

    public PersonRecord(Address address, PersonName personName, PhoneNumber phoneNumber, String email) {

        this.personName = personName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public PersonName getName() {
        return this.personName;
    }

    public Address getAddress() {
        return this.address;
    }

    public PhoneNumber getCellPhone() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

}
