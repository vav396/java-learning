package fundamentalsJava.Final;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Contact {
    private String name;
    private String position;
    private int dateOfBirth;
    private int phoneNumber;

    public Contact(String name, String position, int dateOfBirth, int phoneNumber) {
        this.name = name;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
