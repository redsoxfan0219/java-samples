package edu.cscc;
import java.lang.Integer;

public class PhoneNumber {

    private int areaCode;
    private int prefix;
    private int lineNumber;

    public PhoneNumber (int areaCode, int prefix, int lineNumber){

        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;

    }

    public int getAreaCode() {
        return this.areaCode;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public int getPrefix() {
        return this.prefix;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public String toString() {
        return "(" + Integer.toString(this.areaCode) + ") " + Integer.toString(this.prefix) + "-" + Integer.toString(this.lineNumber);
    }
}
