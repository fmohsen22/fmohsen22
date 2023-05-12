package org.module4;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class TimeDate {
    public static void main(String[] args) {
        Date currentDate = new Date();

        String desiredDateFormat = "yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat sdf = new SimpleDateFormat(desiredDateFormat);

        String formattedDate = sdf.format(currentDate);

        System.out.println(
                "Old format of the date"+currentDate+
                " --- New Format of the Date = "+ formattedDate
        );
    }
}
