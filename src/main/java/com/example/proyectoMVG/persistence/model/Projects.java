package com.example.proyectoMVG.persistence.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table (name = "projects")
@NoArgsConstructor 
@Getter 
@Setter 

public class Projects {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "project_id")
    private Long projectId;
    @Column (name = "project_name")
    private String projectName;
    @Column (name = "description")
    private String description;
    @Column (name = "start_date")
    private String startDate;
    @Column (name = "end_date")
    private String endDate;
    @Column (name = "repositiry_url")
    private String repositiryUrl;
    @Column (name = "demo_url")
    private String demoUrl;
    @Column (name = "picture")
    private String picture;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "status_status_id", referencedColumnName = "status_status_id")
    private Status status;


    @ManyToMany ( fetch = FetchType.LAZY)
    @JoinTable (name = "technologies_used_in_projects", joinColumns = {@JoinColumn(name = "projects_project_id", referencedColumnName = "projects_project_id")}
    , inverseJoinColumns = {@JoinColumn(name = "technologies_tech_id", referencedColumnName = "technologies_tech_id")})
    private List<Technologies> technologies;

    @ManyToMany ( fetch = FetchType.LAZY)
    @JoinTable (name = "developers_worked_on_projects", joinColumns = {@JoinColumn(name = "projects_project_id", referencedColumnName = "projects_project_id")}
    , inverseJoinColumns = {@JoinColumn(name = "developers_dev_id", referencedColumnName = "developers_dev_id")})
    private List<Developers> developers;

    
}
