package com.activedroute.activatedroute.model;

import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "detail", types = {Person.class})
public interface PersonDetailProjection {
    Long getId();
    String getName();
    List<PersonTask> getPersonTasks();
}
