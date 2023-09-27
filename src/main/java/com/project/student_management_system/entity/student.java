package com.project.student_management_system.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "students")
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name" , nullable = false)
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name="email")
    private String email;

    
    public student() {
    }
    

    
    public student(String firstname, String lastname, String email) {
        this.first_name = firstname;
        this.last_name = lastname;
        this.email = email;
    }


 

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.first_name;
    }

    public void setFirstname(String firstname) {
        this.first_name = firstname;
    }

    public String getLastname() {
        return this.last_name;
    }

    public void setLastname(String lastname) {
        this.last_name = lastname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}

