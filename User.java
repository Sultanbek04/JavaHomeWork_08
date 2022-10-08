package com.google.lesson_08;


public class User {
    private String firstName;
    private String lastName;
    private int Age;
    private Gender gender;
    private String mail;
    private String country;

    public User(){}

    public User(String firstName, String lastName, int age, Gender gender, String mail, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        this.gender = gender;
        this.mail = mail;
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Age=" + Age +
                ", gender=" + gender +
                ", mail='" + mail + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}