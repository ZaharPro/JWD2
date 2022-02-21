package by.epam.zahar._main;

import by.epam.zahar.exception.TariffException;
import by.epam.zahar.parser.factory.TariffParserFactory;
import by.epam.zahar.parser.AbstractTariffsBuilder;
import by.epam.zahar.validation.XmlValidator;

public class Main {
    public static void main(String[] args) throws TariffException {
        String type = "dom";
        System.out.println(XmlValidator.isValid("src/main/resources/data_xml/tariffs.xml", "src/main/resources/data_xml/tariffs.xsd"));
        AbstractTariffsBuilder builder = TariffParserFactory.createTariffBuilder(type);
        builder.buildSetTariffs("src/test/resources/test_data/tariffsValid.xml");
        System.out.println(builder.getTariffs());

    }
}
