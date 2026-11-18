package com.example.proyectoMVG.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table (name = "developers")
@NoArgsConstructor 
@Getter 
@Setter 

public class Developers {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "dev_id")
    private Long devId;
    @Column (name = "dev_name")
    private String devName;
    @Column (name = "dev_surname")
    private String devSurname;
    @Column (name = "email")
    private String email;
    @Column (name = "linkedin_url")
    private String linkedinUrl;
    @Column (name = "github_url")
    private String githubUrl;
    
}
