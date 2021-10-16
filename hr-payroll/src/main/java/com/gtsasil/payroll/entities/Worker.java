package com.gtsasil.payroll.entities;

import java.util.Objects;


public class Worker {

    private Long id;
    private String name;
    private Double daily_Income;

    public Worker() {
    }

    public Worker(Long id, String name, Double daily_Income) {
        this.id = id;
        this.name = name;
        this.daily_Income = daily_Income;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDaily_Income() {
        return daily_Income;
    }

    public void setDaily_Income(Double daily_Income) {
        this.daily_Income = daily_Income;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker worker = (Worker) o;
        return getId().equals(worker.getId()) && Objects.equals(getName(), worker.getName()) && Objects.equals(getDaily_Income(), worker.getDaily_Income());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDaily_Income());
    }
}

