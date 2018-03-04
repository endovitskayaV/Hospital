package ru.vsu.hospital.domain.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;


@Entity
@EqualsAndHashCode(callSuper = true)
public class Med extends Treatment{
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

    @OneToMany
    @JoinColumn(name = "schedule_id", referencedColumnName = "id", nullable = false)
    public List<Schedule> getScheduleList() {
        return scheduleList;
    }

   Med setId(long id) {
        this.id = id;
        return this;
    }

   Med setName(String name) {
        this.name = name;
        return this;
    }

    Med setAmountpDay(int amountpDay) {
        this.amountpDay = amountpDay;
        return this;
    }

    Med setScheduleList(List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
        return this;
    }

    Med setIsOn(boolean isOn) {
        this.isOn = isOn;
        return this;
    }
}
