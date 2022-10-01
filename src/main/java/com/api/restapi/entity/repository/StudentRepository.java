package com.api.restapi.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restapi.entity.StudentDetails;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails, Long> {
	StudentDetails findByBranch(String branch);

}
