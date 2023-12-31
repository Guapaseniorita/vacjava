package com.example.demovacjava.vaccinaresult;

public class OneYearVacRes extends VaccineResult {
    @Override
    public String getMessage() {
        return """
                Какие вакцины нужно сделать:
                1.Вакцинация против кори, краснухи, эпидемического паротита
                2.Четвертая вакцинация против вирусного гепатита В для группы риска

                Должны быть сделаны:
                1. Три вакцинации против вирусного гепатита В и еще одна вакцинация  на 3 месяце для группы риска
                2. Вакцинация против туберкулеза
                3. Две вакцинации против пневмококковой инфекции
                4. Первая вакцинация против пневмококковой инфекции
                5. Три вакцинации против дифтерии, коклюша, столбняка
                6. Три вакцинации против полиомиелита
                7. Три вакцинации против гемофильной инфекции типа b

                Следующая вакцинация: в 15 месяцев:
                1. Ревакцинация против пневмококковой инфекции

                (!) Календарь
                (!) Группа риска гепатита B
                """;
    }
}
