package edu.cscc;

public class PersonName {

    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    public PersonName(String title, String firstName, String middleName, String lastName, String suffix) {

        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;

    }

    public String getTitle() {
        return this.title;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getSuffix(String suffix) {
        this.suffix = suffix;
    }

}
