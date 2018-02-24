package ru.vsu.hospital.domain.entity;

import java.util.List;

public class Med extends Treatment{
    private int amountpDay;
    private List<Schedule> scheduleList;
    private boolean isOn;
}
