package ru.vsu.hospital.domain.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = true)
public class Operation extends Treatment {
    private String description;
    private String result;


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

    @Column(name = "result")
    public String getResult() {
        return result;
    }
    Operation setId(long id) {
        this.id = id;
        return this;
    }

    Operation setName(String name) {
        this.name = name;
        return this;
    }

    Operation setDescription(String description) {
        this.description = description;
        return this;
    }

    Operation setResult(String result) {
        this.result = result;
        return this;
    }
}
