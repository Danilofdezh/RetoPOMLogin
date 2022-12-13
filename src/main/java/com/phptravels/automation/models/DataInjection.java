package com.phptravels.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("en-US"));

    private String  email, password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }



    public DataInjection(){
        this.email = "danilofdezh@gmail.com";
        this.password = "12345678";


    }
}
