package edu.cscc;

public class PersonRecordBuilder {

    public PersonRecordBuilder() {
    }

    public PersonRecord createTestRecord() {
        Address address = new Address("120 North Tulip Tree Drive",
                "Jackson", "OH", "45640");
        PersonName name = new PersonName("Dr.", "Adelaide", "Penelope",
                "Aardvark", "Sr.");
        PhoneNumber cellPhone = new PhoneNumber(740,555,1005);

        PersonRecord record = new PersonRecord(address, name, cellPhone, "adelaide.aardvark@home.com");

        return record;
    }
}
