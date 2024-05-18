package com.rasimalimgulov.spring.rest.entity;



public class Dancer {
    int id;

    String name;

    String surname;

    int year;

    String danceClub;
    public Dancer(){
    }

    public Dancer(String name, String surname, int year, String danceClub) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.danceClub = danceClub;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surName) {
        this.surname = surName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDanceClub() {
        return danceClub;
    }

    public void setDanceClub(String danceClub) {
        this.danceClub = danceClub;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", danceClub='" + danceClub + '\'' +
                '}'+"\n";
    }
}
