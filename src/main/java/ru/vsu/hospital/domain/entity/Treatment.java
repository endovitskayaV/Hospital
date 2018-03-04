package ru.vsu.hospital.domain.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Treatment {
    protected long id;
    protected String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    @ManyToMany(mappedBy="entities")
    private List<PatientCard> patientCards= new ArrayList<>();

    Treatment setId(long id) {
        this.id = id;
        return this;
    }

    Treatment setName(String name) {
        this.name = name;
        return this;
    }

    Treatment setPatientCards(List<PatientCard> patientCards) {
        this.patientCards = patientCards;
        return this;
    }
}
