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
@Table (name = "technologies")
@NoArgsConstructor 
@Getter 
@Setter 
public class Technologies {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "tech_id")
    private Long techId;
    @Column (name = "tech_name")
    private String techName;

}
