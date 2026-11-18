package com.example.proyectoMVG.persistence.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table(name = "status")
@NoArgsConstructor 
@Getter 
@Setter 


public class Status {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "status_id")
    private Long statusId;
    @Column (name = "status_name")
    private String statusName;

    @OneToMany (mappedBy = "status" ,  fetch = FetchType.LAZY)
    private List<Projects> projects;
    

    
}
