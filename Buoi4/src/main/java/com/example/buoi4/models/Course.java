package com.example.buoi4.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Course {
    private int id;
    private String lectureName;
    private String place;
    private LocalDate startDate;
}
