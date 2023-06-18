package com.example.demovacjava.services;

import com.example.demovacjava.models.Input;
import com.example.demovacjava.vaccinaresult.VaccineResultFactory;
import com.example.demovacjava.vaccinaresult.VaccineResult;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
@Service
public class Output {
    private Input input;
    public String result(Input input) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(input.getYear(), input.getMonth(), input.getDae());
        Period period = Period.between(birthday, today);
        int y = period.getYears();
        int m = period.getMonths();
        VaccineResultFactory factory = new VaccineResultFactory();
        return factory.createResult(y, m).getMessage();
    }
}
