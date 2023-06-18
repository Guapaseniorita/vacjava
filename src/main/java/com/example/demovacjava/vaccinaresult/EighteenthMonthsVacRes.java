package com.example.demovacjava.vaccinaresult;

public class EighteenthMonthsVacRes extends VaccineResult {
    @Override
    public String getMessage() {
        return """
                Какие вакцины нужно сделать?
                1.Первая ревакцинация против дифтерии, коклюша, столбняка
                2.Первая ревакцинация против полиомиелита
                3.Ревакцинация против гемофильной инфекции типа b

                Должны быть сделаны:
                1. Три вакцинации против вирусного гепатита В и дополнительные две вакцинации: на 3 и 12 месяцах для группы риска
                2. Вакцинация против туберкулеза
                3. Две вакцинации против пневмококковой инфекции
                4.Первая вакцинация против пневмококковой инфекции и ревакцинация против пневмококковой инфекции
                5. Три вакцинации против дифтерии, коклюша, столбняка
                6. Три вакцинации против полиомиелита
                7. Три вакцинации против гемофильной инфекции типа b
                8.  Вакцинация против кори, краснухи, эпидемического паротита

                Следующая вакцинация в 20 месяцев:
                1.Вторая ревакцинация против полиомиелита

                (!) Календарь
                (!) Группа риска гепатита B
                """;
    }

}