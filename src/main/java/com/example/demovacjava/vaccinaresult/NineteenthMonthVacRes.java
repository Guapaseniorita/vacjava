package com.example.demovacjava.vaccinaresult;

public class NineteenthMonthVacRes extends VaccineResult {
    @Override
    public String getMessage() {
        return """
                Удобный период для наверстывающей вакцинации. Нужно только просмотреть, какие вакцины еще не были сделаны к текущему моменту.

                Должны быть сделаны:
                1. Три вакцинации против вирусного гепатита В и дополнительные две вакцинации: на 3 и 12 месяцах для группы риска
                2. Вакцинация против туберкулеза
                3. Две вакцинации против пневмококковой инфекции
                4.Первая вакцинация против пневмококковой инфекции и ревакцинация против пневмококковой инфекции
                5. Три вакцинации против дифтерии, коклюша, столбняка и первая ревакцинация против дифтерии, коклюша, столбняка
                6. Три вакцинации против полиомиелита и первая ревакцинация против полиомиелита 7. Три вакцинации против гемофильной инфекции типа b и ревакцинация против гемофильной инфекции типа b
                8. Вакцинация против кори, краснухи, эпидемического паротита

                Следующая вакцинация в 20 месяцев:
                1.Вторая ревакцинация против полиомиелита

                (!) Календарь
                (!) Группа риска гепатита B
                """;
    }

}
