package org.institute.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.security.PrivateKey;

@Entity
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;
    private String urlPhoto;
    private int money;
    private String birthDay;
    private boolean gender;
    private String Address;
    private boolean active;

    public student() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public int getMoney() {
        return money;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public boolean isGender() {
        return gender;
    }

    public String getAddress() {
        return Address;
    }

    public boolean isActive() {
        return active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
