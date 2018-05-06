package com.example.newa.domain;

import lombok.*;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Consultant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int salary;

    @ManyToMany(mappedBy = "consultants")
    Set<Cars> cars=new HashSet<>();

    public Consultant(String name, int salary, Set<Cars> cars) {
        this.name = name;
        this.salary = salary;
        this.cars = cars;
    }
}
