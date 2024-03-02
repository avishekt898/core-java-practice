package objectbasic.predefinedclass.timecoversion;

import javax.xml.transform.Result;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateConverter {
    public static void main(String[] args) {
        String[] dateStrings = {"2024-02-28","02-29-2024","2024/02/28"};
        String[] inputFormats ={"yyyy-MM-dd", "MM-dd-yyyy", "yyyy/MM/dd"};

        String desiredFormat = "EEE dd MMM";
        String try1 = convertedDate(inputFormats[0],dateStrings[0],desiredFormat);
        System.out.println(try1);
        String try2 = convertedDate(inputFormats[1],dateStrings[1],desiredFormat);
        System.out.println(try2);
        String try3 = convertedDate(inputFormats[2],dateStrings[2],desiredFormat);
        System.out.println(try3);

    }

    public static String convertedDate(String inputFormat, String dateStrings, String desiredFormat){

            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(inputFormat);
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern(desiredFormat);
            LocalDate date = LocalDate.parse(dateStrings, inputFormatter);
            return date.format(outputFormatter);

    }


}