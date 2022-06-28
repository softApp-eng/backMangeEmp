package com.group.backmangeemp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone ;
    private String imageUrl;
    @Column(nullable = false,updatable = false)
    private String empCode;
}
