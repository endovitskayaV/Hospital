package ru.vsu.hospital.domain.entity;

import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.MetaValue;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@EqualsAndHashCode
public class PatientCard{//<T extends Treatment> {
    private long id;
    private String name;
    private String surname;
    private String parentalName;
    private int passportSeries;
    private int passportNumber;
    private String address;
    private Date arrivalDate;
    private Date leavingDate;
    private Department department;
    private Doctor doctor;
    private int room;
    private String diagnosis;
    private List<Treatment> treatments;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    long getId() {
        return id;
    }

    @Column(name = "name", nullable = false)
    String getName() {
        return name;
    }

    @Column(name = "surname", nullable = false)
    String getSurname() {
        return surname;
    }

    @Column(name = "parental_name", nullable = false)
    String getParentalName() {
        return parentalName;
    }

    @Column(name = "passport_series", nullable = false)
    int getPassportSeries() {
        return passportSeries;
    }

    @Column(name = "passport_number", nullable = false)
    int getPassportNumber() {
        return passportNumber;
    }

    @Column(name = "address")
    String getAddress() {
        return address;
    }

    @Column(name = "arrival_date")
    Date getArrivalDate() {
        return arrivalDate;
    }

    @Column(name = "leaving_date")
    Date getLeavingDate() {
        return leavingDate;
    }

    @Column(name = "department", nullable = false)
    Department getDepartment() {
        return department;
    }

    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "id", nullable = false)
    Doctor getDoctor() {
        return doctor;
    }

    @Column(name = "room", nullable = false)
    int getRoom() {
        return room;
    }

    @Column(name = "diagnosis", nullable = false)
    String getDiagnosis() {
        return diagnosis;
    }

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "treatment",
//            //foreign key for PatientCardEntity in patient_card_treatment table
//            joinColumns = @JoinColumn(name = "patient_card_id"),
//            //foreign key for other side - TreatmentEntity in patient_card_treatment table
//            inverseJoinColumns = @JoinColumn(name = "treatment_id"))


   /* @Any(metaColumn = @Column(name = "treatments", nullable = false))
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "treatment",
            //foreign key for PatientCardEntity in patient_card_treatment table
            joinColumns = @JoinColumn(name = "patient_card_id"),
            //foreign key for other side - TreatmentEntity in patient_card_treatment table
            inverseJoinColumns = @JoinColumn(name = "treatment_id"))
   // @JoinColumn(name = "product_id", nullable = false)
    @AnyMetaDef(
            idType = "long",
            metaType = "string",
            metaValues = {
                    @MetaValue(value = "Med", targetEntity = Med.class),
                    @MetaValue(value = "Operation", targetEntity = Operation.class),
                    @MetaValue(value = "Procedure", targetEntity = Procedure.class),
                    @MetaValue(value = "Test", targetEntity = Test.class)
            })
            List<T> getTreatments() {
        return treatments;
    }
    */

    @ManyToMany
   List<Treatment> getTreatments() {
       return treatments;
   }


   private PatientCard setId(long id) {
        this.id = id;
        return this;
    }

    PatientCard setName(String name) {
        this.name = name;
        return this;
    }

    PatientCard setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    PatientCard setParentalName(String parentalName) {
        this.parentalName = parentalName;
        return this;
    }

    PatientCard setPassportSeries(int passportSeries) {
        this.passportSeries = passportSeries;
        return this;
    }

    PatientCard setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
        return this;
    }

    PatientCard setAddress(String address) {
        this.address = address;
        return this;
    }

    PatientCard setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
        return this;
    }

    PatientCard setLeavingDate(Date leavingDate) {
        this.leavingDate = leavingDate;
        return this;
    }

    PatientCard setDepartment(Department department) {
        this.department = department;
        return this;
    }

    PatientCard setDoctor(Doctor doctor) {
        this.doctor = doctor;
        return this;
    }

    PatientCard setRoom(int room) {
        this.room = room;
        return this;
    }

    PatientCard setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        return this;
    }

    PatientCard setTreatments(List<Treatment> treatments) {
        this.treatments = treatments;
        return this;
    }
}
