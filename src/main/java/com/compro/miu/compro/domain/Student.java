package com.compro.miu.compro.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Student extends Person {
    @Id
    @GeneratedValue
    private Integer studentId;
}