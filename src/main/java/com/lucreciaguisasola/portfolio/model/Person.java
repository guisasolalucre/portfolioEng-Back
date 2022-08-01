package com.lucreciaguisasola.portfolio.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob;

    private String ubication;

    @Column(nullable = false)
    private String ocupation;

    @Column(nullable = false)
    private String about;
    
    private String photo;
    
    private String banner;
    
    @Column(nullable = false)
    private String linkedin;

    @Column(nullable = false)
    private String github;

    @Column(nullable = false)
    private String whatsapp;

    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String user;
    
    @Column(nullable = false)
    private String password;
            
    public Person() {
    }

    
}
