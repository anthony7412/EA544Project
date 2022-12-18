package com.compro.miu.compro.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;
    private String name;

    private String email;
    @Embedded
    private Address address;
}