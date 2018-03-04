package ru.vsu.hospital.domain.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = true)
public class Nurse extends Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "surname", nullable = false)
    public String getSurname() {
        return surname;
    }

    @Column(name = "parental_name")
    public String getParentalName() {
        return parentalName;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "department")
    public Department getDepartment() {
        return department;
    }

    private Nurse setId(long id) {
        this.id = id;
        return this;
    }

    Nurse setName(String name) {
        this.name = name;
        return this;
    }

    Nurse setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    Nurse setParentalName(String parentalName) {
        this.parentalName = parentalName;
        return this;
    }

    Nurse setDepartment(Department department) {
        this.department = department;
        return this;
    }

}
