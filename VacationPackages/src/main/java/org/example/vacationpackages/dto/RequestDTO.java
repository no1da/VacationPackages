package org.example.vacationpackages.dto;

import java.time.LocalDate;

public class RequestDTO {

    private double averageSalary;
    private LocalDate dateStartVacation;
    private int countDay;

    public double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public LocalDate getDateStartVacation() {
        return dateStartVacation;
    }

    public void setDateStartVacation(LocalDate dateStartVacation) {
        this.dateStartVacation = dateStartVacation;
    }

    public int getCountDay() {
        return countDay;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }
}
