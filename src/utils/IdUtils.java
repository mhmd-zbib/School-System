package utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class IdUtils {


    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static int counter = 0;

    public static synchronized String generateId() {
        LocalDateTime now = LocalDateTime.now();
        String baseId = now.format(formatter);
        String id = baseId + String.format("%03d", counter);
        counter = (counter + 1) % 1000;
        return id;
    }
}
