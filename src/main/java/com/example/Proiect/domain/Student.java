package com.example.Proiect.domain;

import com.fasterxml.jackson.annotation.JsonGetter;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long id;
    private String nume;
    private String prenume;
    private String email;
    private double media;

    public Student() {
        super();
    }

    public Student(Long id, String nume, String prenume, String email, double media) {
        super();
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.media = media;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {

        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
