package org.example.model;

import org.example.enums.PonyType;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private LocalDate registrationDate;
    private List<Pony> ponies = new ArrayList<>();

    public User(String username, LocalDate registrationDate) {
        this.username = username;
        this.registrationDate = registrationDate;
        this.ponies = addPonyIfAugust();
    }

    private List<Pony> addPonyIfAugust() {
        if (registrationDate.getMonth() == Month.AUGUST) {
            this.ponies.add(new Pony("SuperPony", PonyType.SUPERPONY));
        }
        return this.ponies;
    }

    public void addPony(Pony pony) {
        ponies.add(pony);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<Pony> getPonies() {
        return this.ponies;
    }

    public void setPonies(List<Pony> ponies) {
        this.ponies = ponies;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", registrationDate=" + registrationDate +
                ", ponies=" + ponies +
                '}';
    }
}
