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
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String career;

    @Column(nullable = false)
    private String institution;

    @Column(nullable = false)
    private String ubication;

    @Column(nullable = false)
    private String start;

    @Column(nullable = true)
    private String finish;

    public Education() {
    }
}
