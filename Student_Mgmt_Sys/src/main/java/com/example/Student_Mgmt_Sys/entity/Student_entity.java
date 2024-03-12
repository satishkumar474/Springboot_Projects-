package com.example.Student_Mgmt_Sys.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student_Mgmt_Sys")
@Entity
public class Student_entity {
	@Id
    @GeneratedValue(strategy = GenerationType .IDENTITY)
    private Long id;
	private String Name;
    private String Roll_Number;
    private String Father_Name;
    private String Sex;
    private Double Attendance_Percentage;
    private Double Marks;
    private String Department;
    private String Student_Status;
    

}
