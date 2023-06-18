package com.example.demovacjava.vaccinaresult;

public class SixMonthVacRes extends VaccineResult {
    @Override
    public String getMessage() {
        return """
                Какие вакцины нужно сделать:
                1.Третья вакцинация против дифтерии, коклюша, столбняка
                2.Третья вакцинация против вирусного гепатита B
                3.Третья вакцинация против полиомиелита
                4.Третья вакцинация против гемофильной инфекции типа

                Должны быть сделаны:
                1. Две вакцинации против вирусного гепатита В и третья в группе риска
                2. Вакцинация против туберкулеза
                3. Две вакцинации против пневмококковой инфекции
                4. Первая вакцинация против пневмококковой инфекции
                5. Две вакцинации против дифтерии, коклюша, столбняка
                6. Две вакцинации против полиомиелита
                7.  Две вакцинации против гемофильной инфекции типа b

                Следующая вакцинация: в 12 месяцев:
                1. Вакцинация против кори, краснухи, эпидемического паротита
                2. Четвертая вакцинация против вирусного гепатита В для группы риска

                (!) Календарь
                (!) Группа риска гепатита B
                """;
    }
}