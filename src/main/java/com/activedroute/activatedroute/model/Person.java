package com.activedroute.activatedroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Person")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Person_Id")
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "DoB")
    private LocalDate doB;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person")
    private List<PersonTask> personTasks;

    public Person() { }

    public Person(String name, LocalDate doB, List<PersonTask> personTasks) {
        this.name = name;
        this.doB = doB;
        this.personTasks = personTasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoB() {
        return doB;
    }

    public void setDoB(LocalDate doB) {
        this.doB = doB;
    }

    public List<PersonTask> getPersonTasks() {
        return personTasks;
    }

    public void setPersonTasks(List<PersonTask> personTasks) {
        this.personTasks = personTasks;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doB=" + doB +
                ", personTasks=" + personTasks +
                '}';
    }
}
