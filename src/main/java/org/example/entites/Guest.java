package org.example.entites;

import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String name;
    private Long phoneNumber;

    public Guest(String name, Long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        availableDates=new ArrayList<>();
    }

    private List<TimesOfWeek> availableDates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
