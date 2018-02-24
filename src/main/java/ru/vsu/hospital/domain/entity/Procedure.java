package ru.vsu.hospital.domain.entity;

import java.util.List;

public class Procedure extends Treatment {
    private int amountpDay;
    private List<Schedule> scheduleList;
    private boolean isOn;
}
