package com.example.Student_Mgmt_Sys.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Student_Mgmt_Sys.entity.Student_entity;

@Repository
public interface StudentRepositor extends JpaRepository<Student_entity, Long> {

}
