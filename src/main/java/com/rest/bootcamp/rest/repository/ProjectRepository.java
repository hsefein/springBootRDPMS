package com.connect.connect2.repository;

import com.connect.connect2.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RepositoryRestController
public interface ProjectRepository extends CrudRepository<Project, Long> {
    List<Project> findByName (@Param(value = "project_name") String project_name);
}
