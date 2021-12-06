package com.example.course.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Date birthday;
    private String address;
    private String phone;
    private String passport;
    @OneToOne
    private Department department;
    private String contract;
    @OneToOne
    private Position position;
}
