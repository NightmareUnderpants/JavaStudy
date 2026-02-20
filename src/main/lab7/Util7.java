package main.lab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util7
{
    /** "паспорт, регистрация, СНИЛС"
     * пример данных "1207 558844 г. Владивосток, и тд... 12345678900"
    */
    public static boolean isCorrect(String str)
    {
        /**
         * \\d - символы цифр
         * \\s - пробел
         * .* - любые символы
         */
        Pattern pattern = Pattern.compile("^\\d{4}\\s\\d{6}\\s.*\\d{11}$");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }

        return matcher.matches();
    }
}
