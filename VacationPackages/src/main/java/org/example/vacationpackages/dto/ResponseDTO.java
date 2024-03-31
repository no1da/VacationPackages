package org.example.vacationpackages.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ResponseDTO {
    private BigDecimal HolidayPay;
    private LocalDate endVacationDate;

    public ResponseDTO() {

    }

    public BigDecimal getHolidayPay() {
        return HolidayPay;
    }

    public void setHolidayPay(BigDecimal holidayPay) {
        HolidayPay = holidayPay;
    }

    public LocalDate getEndVacationDate() {
        return endVacationDate;
    }

    public void setEndVacationDate(LocalDate endVacationDate) {
        this.endVacationDate = endVacationDate;
    }

}
