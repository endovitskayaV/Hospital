package ru.vsu.hospital.domain.entity;

public abstract class Worker {
    protected enum Position{
        DOCTOR, NURSE,LAB
    }
    protected int id;
    protected String name;
    protected String surname;
    protected String parentalName;
    protected Position position;
    protected Department department;
}
