package org.example.entites;

import java.util.*;

public class Teacher {
    private Long id;
    private String name;
    private Date bithDate;

    private Long phoneNumber;

    private List<TimesOfWeek> availableDates;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", availableDates=\n" + availableDates +
                '}';
    }

    public Teacher(String name) {
        this.name = name;
        availableDates=new ArrayList<>();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBithDate() {
        return bithDate;
    }

    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<TimesOfWeek> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<TimesOfWeek> availableDates) {
        this.availableDates = availableDates;
    }


}
