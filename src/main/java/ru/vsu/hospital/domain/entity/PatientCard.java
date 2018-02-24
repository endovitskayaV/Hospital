package ru.vsu.hospital.domain.entity;

import java.util.Date;
import java.util.List;

public class PatientCard {
    private int id;
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

}
