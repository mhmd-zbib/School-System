package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IdUtils {


    public static int generateId() {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(now);

        return Integer.parseInt(dateString);

    }


}
