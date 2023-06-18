package com.example.demovacjava.vaccinaresult;

import com.example.demovacjava.vaccinaresult.*;

public class VaccineResultFactory {
    public VaccineResult createResult(int year, int month) {
         if (year == 0 && month <= 1) {
             return new FirstMonthVacRes();
         } else if (year == 0 && month == 2) {
             return new SecondMonthVacRes();
         } else if (year == 0 && month == 3) {
             return new ThirdMonthVacRes();
         } else if (year == 0 && (month >= 4 && month <= 5)) {
             return new FourFiveMonthVacRes();
        } else if (year == 0 && month == 6) {
             return new SixMonthVacRes();
         } else if (year == 0 && (month >= 7 && month <= 11)) {
             return new SevenElevenMonthVacRes();
         } else if (year == 1 && month < 1) {
             return new OneYearVacRes();
         } else if (year == 1 && (month >= 1 && month <= 2)) {
             return new ThirteenFourteenMonthsVacRes();
         } else if (year == 1 && month == 3) {
             return new FifteenthMonthsVacRes();
         } else if (year == 1 && month >= 4 && month <= 5) {
             return new SixteenthSeventeenMonthsVacRes();
         } else if (year == 1 && month == 6) {
             return new EighteenthMonthsVacRes();
         } else if (year == 1 && month == 7) {
            return new NineteenthMonthVacRes();
         } else if (year == 1 && month == 8) {
             return new TwentiethMonthsVacRes();
         } else if ((year == 1 && (month >= 9 && month <= 11)) || (year >= 2 && year <= 5)) {
             return new OneFiveYearsVacRes();
         } else if (year == 6) {
             return new SixYearsVacRes();
         } else if (year == 7) {
             return new SevenYearsVacRes();
         } else if (year >= 8 && year <= 13) {
             return new EightThirteenthYearsVacRes();
         } else if (year == 14) {
             return new FourteenthYearsVacRes();
         } else if (year >= 15 && year <= 17) {
             return new FifteenthSeventeenthYearsVacRes();
         } else {
             return new AdultsVacRes();
         }
    }
}
