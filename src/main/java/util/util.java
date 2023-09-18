package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class util {
    public static String time(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        return now.format(formatter);
    }
}
