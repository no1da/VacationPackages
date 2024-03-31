package org.example.vacationpackages.services;

import org.example.vacationpackages.dto.RequestDTO;
import org.example.vacationpackages.dto.ResponseDTO;
import org.example.vacationpackages.util.CalculationDate;
import org.example.vacationpackages.util.CalculationHolidayPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacationService {
    private final CalculationDate calculationDate;
    private final CalculationHolidayPay calculationHolidayPay;

    @Autowired
    public VacationService(CalculationDate calculationDate, CalculationHolidayPay calculationHolidayPay) {
        this.calculationDate = calculationDate;
        this.calculationHolidayPay = calculationHolidayPay;
    }

    public ResponseDTO getSum(RequestDTO requestDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setEndVacationDate(calculationDate.getCountVacationDate(requestDTO.getDateStartVacation(), requestDTO.getCountDay()));
        responseDTO.setHolidayPay(calculationHolidayPay.getHolidayPay(requestDTO.getAverageSalary(), requestDTO.getCountDay()));
        return responseDTO;
    }
}
