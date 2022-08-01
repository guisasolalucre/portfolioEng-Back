package com.lucreciaguisasola.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Proyect {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String url;
    
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String start;

    @Column(nullable = true)
    private String finish;

    public Proyect() {
    }

}
