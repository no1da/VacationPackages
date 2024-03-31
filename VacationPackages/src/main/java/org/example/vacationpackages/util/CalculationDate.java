package org.example.vacationpackages.util;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CalculationDate {

    public LocalDate getCountVacationDate(LocalDate startDate, int count) {
        LocalDate[] holliday = new LocalDate[14];
        holliday[0] = LocalDate.of(2024, 1, 1);
        holliday[1] = LocalDate.of(2024, 1, 2);
        holliday[2] = LocalDate.of(2024, 1, 3);
        holliday[3] = LocalDate.of(2024, 1, 4);
        holliday[4] = LocalDate.of(2024, 1, 5);
        holliday[5] = LocalDate.of(2024, 1, 6);
        holliday[6] = LocalDate.of(2024, 1, 7);
        holliday[7] = LocalDate.of(2024, 1, 8);
        holliday[8] = LocalDate.of(2024, 2, 23);
        holliday[9] = LocalDate.of(2024, 3, 8);
        holliday[10] = LocalDate.of(2024, 5, 1);
        holliday[11] = LocalDate.of(2024, 5, 9);
        holliday[12] = LocalDate.of(2024, 6, 12);
        holliday[13] = LocalDate.of(2024, 11, 4);

        LocalDate[] vacation = new LocalDate[count];

        for (int i = 0; i < count; i++) {
            vacation[i] = startDate.plusDays(i);
        }

        int countVacation = 0;
        for (int i = 0; i < vacation.length; i++) {
            for (int j = 0; j < holliday.length; j++) {
                if (vacation[i].equals(holliday[j])) {
                    countVacation++;
                }
            }
        }
        return startDate.plusDays(countVacation + count - 1);
    }
}
