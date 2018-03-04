package ru.vsu.hospital.domain.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Test extends Treatment {
    private String description;

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

    @Column(name = "description")
    public String getDescription() {
        return description;
    }
    Test setId(long id) {
        this.id = id;
        return this;
    }

    Test setName(String name) {
        this.name = name;
        return this;
    }

    Test setDescription(String description) {
        this.description = description;
        return this;
    }
}
