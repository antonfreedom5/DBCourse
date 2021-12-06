package com.example.course.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String type;
    private String phone;
    @OneToMany
    private List<Product> product;
}
