package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table
@NoArgsConstructor

public class Teacher extends Userk {
    private String speciality ;
}
