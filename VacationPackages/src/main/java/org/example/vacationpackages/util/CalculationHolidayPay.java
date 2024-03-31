package org.example.vacationpackages.util;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CalculationHolidayPay {
    public BigDecimal getHolidayPay(double averageSalary, int count){
        double sum;
        sum = averageSalary / 12 / 29.3 * count ;
        BigDecimal sum1 = new BigDecimal(sum);
        return sum1 = sum1.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

}
