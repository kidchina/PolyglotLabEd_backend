package com.example.demo.models;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long id ;
    private String firstName ;
    private String lastName;
    private String email ;
    private String password ;

}
