package ru.vsu.hospital.domain.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
@Entity
@EqualsAndHashCode
public class Schedule {
    private int id;
    private Date date;
    private boolean isDone;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    @Column(name = "is_done", nullable = false)
    public boolean getIsDone() {
        return isDone;
    }


    Schedule setId(int id) {
        this.id = id;
        return this;
    }

    Schedule setDate(Date date) {
        this.date = date;
        return this;
    }

    Schedule setIsDone(boolean isDone) {
        this.isDone = isDone;
        return this;
    }
}
