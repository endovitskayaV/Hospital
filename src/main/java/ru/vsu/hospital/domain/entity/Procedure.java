package ru.vsu.hospital.domain.entity;

import javax.persistence.*;
import java.util.List;

public class Procedure extends Treatment {
    private int amountpDay;
    private List<Schedule> scheduleList;
    private boolean isOn;


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


    @Column(name = "amount_per_day", nullable = false)
    public int getAmountpDay() {
        return amountpDay;
    }

    @Column(name = "is_on", nullable = false)
    public boolean getIsOn() {
        return isOn;
    }

    @ManyToOne
    @JoinColumn(name = "schedule_id", referencedColumnName = "id", nullable = false)
    public List<Schedule> getSchedule() {
        return scheduleList;
    }

    Procedure setAmountpDay(int amountpDay) {
        this.amountpDay = amountpDay;
        return this;
    }

    Procedure setScheduleList(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
        return this;
    }

    Procedure setOn(boolean on) {
        isOn = on;
        return this;
    }
    Procedure setId(long id) {
        this.id = id;
        return this;
    }

    Procedure setName(String name) {
        this.name = name;
        return this;
    }
}
