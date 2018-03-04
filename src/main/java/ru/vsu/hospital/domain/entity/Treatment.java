package ru.vsu.hospital.domain.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Treatment {
    protected long id;
    protected String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    @ManyToMany//(mappedBy="entities")
    @JoinTable(
            name="treatment_patient_card",
            joinColumns={@JoinColumn(name="treatment_id", referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="patient_card_id", referencedColumnName="id")})
    private Set<PatientCard> patientCards= new HashSet<>();


    Treatment setId(long id) {
        this.id = id;
        return this;
    }

    Treatment setName(String name) {
        this.name = name;
        return this;
    }

    Treatment setPatientCards(Set<PatientCard> patientCards) {
        this.patientCards = patientCards;
        return this;
    }
}
