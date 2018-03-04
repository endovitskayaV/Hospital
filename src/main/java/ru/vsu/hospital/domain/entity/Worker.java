package ru.vsu.hospital.domain.entity;

public abstract class Worker {
//    protected enum Position{
//        DOCTOR, NURSE,LAB
//    }
    protected long id;
    protected String name;
    protected String surname;
    protected String parentalName;
   // protected Position position;
    protected Department department;
}
