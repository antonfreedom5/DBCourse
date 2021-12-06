package com.example.course.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Return {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String contract;
    private String quality;
    @OneToMany
    private List<Fine> fine;
    @OneToOne
    private Discount discount;
    private Long total;
}
