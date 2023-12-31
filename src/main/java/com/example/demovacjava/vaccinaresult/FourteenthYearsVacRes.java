package com.example.demovacjava.vaccinaresult;

public class FourteenthYearsVacRes extends VaccineResult {
    @Override
    public String getMessage() {
        return """
                    Какие вакцины нужно сделать?
                    1.Третья ревакцинация против дифтерии, столбняка

                    Должны быть сделаны:
                    1.Три вакцинации против вирусного гепатита В и дополнительные две вакцинации: на 3 и 12 месяцах для группы риска
                    2. Вакцинация против туберкулеза и ревакцинация против туберкулеза
                    3. Две вакцинации против пневмококковой инфекции
                    4. Первая вакцинация против пневмококковой инфекции и ревакцинация против пневмококковой инфекции
                    5. Три вакцинации против дифтерии, коклюша, столбняка, а также – первая ревакцинация против дифтерии, коклюша, столбняка, и вторая ревакцинация против дифтерии, столбняка
                    6. Три вакцинации против полиомиелита и три ревакцинации против полиомиелита
                    7. Три вакцинации против гемофильной инфекции типа b и ревакцинация против гемофильной инфекции типа b
                    8. Вакцинация против кори, краснухи, эпидемического паротита

                    Следующая вакцинация - Смотри календарь для взрослых
                    (!) Календарь
                    (!) Группа риска гепатита B
                """;
    }

}
