package com.elifintizam.projectManagement.dataAccess.abstracts;

import com.elifintizam.projectManagement.entities.concretes.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    Optional<Project> findByName(String name);
}
