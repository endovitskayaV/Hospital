package ru.vsu.hospital.domain.entity;

public class Doctor extends Worker {
    private enum Spesiality{
        GP, CARDIOLOGIST, DENTIST
    }
    private  Spesiality spesiality;
    private boolean onDuty;

    public void doSmth(){}

}
