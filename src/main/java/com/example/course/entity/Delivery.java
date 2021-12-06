package com.example.course.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Employee employee;
    @ManyToMany
    private List<Product> products;
    private Date returnDate;
    @OneToOne
    @JoinColumn(insertable = false, updatable = false, name = "contract", referencedColumnName="contract")
    private Return returnContract;
    private String contract;
}
