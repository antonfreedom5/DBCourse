package com.example.course.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    @ManyToOne
    private Storage availability;
    private Long costPerDay;
    private String quality;
}
