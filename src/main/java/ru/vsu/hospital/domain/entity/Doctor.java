package ru.vsu.hospital.domain.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EqualsAndHashCode(callSuper = true)
public class Doctor extends Worker {
    private enum Speciality {
        GP, CARDIOLOGIST, DENTIST
    }

    private Speciality speciality;
    private boolean onDuty;


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

//    @Enumerated(EnumType.STRING)
//    @Column(name = "position", nullable = false)
//    public Position getPosition() {
//        return position;
//    }

    @Enumerated(EnumType.STRING)
    @Column(name = "department")
    public Department getDepartment() {
        return department;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "speciality", nullable = false)
    Speciality getSpeciality() {
        return speciality;
    }


    @Column(name = "on_duty")
    boolean getOnDuty() {
        return onDuty;
    }


    private List<PatientCard> patientCards= new ArrayList<>();
    //TODO:CascadeType.ALL????
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
    public List<PatientCard> getPatientCards() {
        return patientCards;
    }

   private void setPatientCards(List<PatientCard> patientCards) {
        this.patientCards= patientCards;
    }

    public void addContacts(PatientCard patientCard) {
        patientCard.setDoctor(this);
       patientCards.add(patientCard);
    }


    private Doctor setId(long id) {
        this.id = id;
        return this;
    }

    Doctor setName(String name) {
        this.name = name;
        return this;
    }

    Doctor setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    Doctor setParentalName(String parentalName) {
        this.parentalName = parentalName;
        return this;
    }

//   private Doctor setPosition(Position position) {
//        this.position = position;
//        return this;
//    }

    Doctor setDepartment(Department department) {
        this.department = department;
        return this;
    }


    Doctor setSpeciality(Speciality speciality) {
        this.speciality = speciality;
        return this;
    }

    Doctor setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
        return this;
    }


}
