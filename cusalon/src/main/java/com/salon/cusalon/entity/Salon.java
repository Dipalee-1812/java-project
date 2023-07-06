package com.salon.cusalon.entity;

import java.sql.Date;

// import java.util.Date;

// import org.springframework.data.jpa.repository.Temporal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Salon {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    
    private Integer id;
    private String name;
    private Long mob;
    private String amenity;
    private String Gender;
    // private Long Password;
    private Date aptime;

    
}
