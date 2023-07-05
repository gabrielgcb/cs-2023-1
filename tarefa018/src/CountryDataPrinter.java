import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class CountryDataPrinter {

    public static void main(String[] args) {
        String[] countries = {
                "US", "BR", "CN", "DE", "FR",
                "IN", "IT", "JP", "RU", "AU"
        };

        for (String countryCode : countries) {
            Locale locale = new Locale("", countryCode);
            ResourceBundle bundle = ResourceBundle.getBundle(countryCode, locale);

            System.out.println("País: " + bundle.getString("country.name"));
            System.out.println("Linguagem: " + bundle.getString("country.language"));
            printDateFormats(bundle, locale);
            printCurrencyInfo(bundle, locale);
            System.out.println("Separador de decimal: " + bundle.getString("country.currency.decimalSeparator"));
            System.out.println("Separador de milhar: " + bundle.getString("country.currency.groupingSeparator"));
            System.out.println("Código de página windows: " + bundle.getString("country.windowsCodePage"));
            System.out.println("--------------------");
        }
    }

    private static void printDateFormats(ResourceBundle bundle, Locale locale) {
        SimpleDateFormat shortDateFormat = (SimpleDateFormat) DateFormat.getDateInstance(DateFormat.SHORT, locale);
        SimpleDateFormat longDateFormat = (SimpleDateFormat) DateFormat.getDateInstance(DateFormat.LONG, locale);
        DateFormat timeFormat = new SimpleDateFormat(bundle.getString("country.timeFormat"), locale);

        System.out.println("Data no formato curto: " + shortDateFormat.format(System.currentTimeMillis()));
        System.out.println("Data no formato longo: " + longDateFormat.format(System.currentTimeMillis()));
        System.out.println("Formato de hora: " + timeFormat.format(System.currentTimeMillis()));
    }

    private static void printCurrencyInfo(ResourceBundle bundle, Locale locale) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);

        System.out.println("Símbolo da moeda local: " + currencyFormat.getCurrency().getSymbol(locale));
    }
}
