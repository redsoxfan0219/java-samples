package edu.cscc;

public class Main {
    public static void main(String[] args) {
        //TODO Uncomment the following line of code AFTER you've created the PersonRecord, PersonName, Address, and PhoneNumber classes.
        PersonRecord personRecord = new PersonRecordBuilder().createTestRecord();
        PersonName name = personRecord.getName();
        Address address = personRecord.getAddress();
        PhoneNumber phoneNumber = personRecord.getCellPhone();
        System.out.println("Email: " + personRecord.getEmail());
        System.out.print("Name: ");
        System.out.println(name.getTitle() + " " + name.getFirstName() + " " + name.getMiddleName() + " " + name.getLastName() + " " + name.getSuffix());
        System.out.println("Address: ");
        System.out.println(address.getStreetAddress());
        System.out.println(address.getCity() + ", " + address.getState() + " " + address.getZip());
        System.out.println("Mobile Phone: " + phoneNumber.toString());
    }
}
