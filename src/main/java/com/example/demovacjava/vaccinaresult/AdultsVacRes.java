package com.example.demovacjava.vaccinaresult;


public class AdultsVacRes extends VaccineResult {
    @Override
    public String getMessage(){
        return """
                Правила ревакцинации для взрослых:
                Ревакцинация против дифтерии, столбняка - каждые 10 лет от момента последней ревакцинации
                Только для женщин от 18 до 25 лет (включительно), не болевшие, не привитые, не имеющие сведений о прививках против краснухи - Вакцинация против краснухи
                Привитые однократно против краснухи - Ревакцинация против краснухи
                Взрослые от 18 до 35 лет (включительно), не болевшие, не привитые, не имеющие сведений о прививках против кори - Вакцинация против кори
                Привитые однократно -  Ревакцинация против кори
                Взрослые от 36 до 55 лет (включительно), относящиеся к группам риска (работники медицинских и организаций, осуществляющих образовательную деятельность, организаций торговли, транспорта, коммунальной и социальной сферы; лица, работающие вахтовым методом, и сотрудники государственных контрольных органов в пунктах пропуска через государственную границу Российской Федерации), не болевшие, не привитые,  не имеющие сведений о прививках против кори - Вакцинация против кори                                       Привитые однократно - Ревакцинация против кори
                Ежегодная вакцинация против гриппа
            """;
        }
        }
