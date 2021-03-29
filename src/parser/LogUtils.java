package parser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class LogUtils {

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss,SSS");

    public static void addEntry(String string, List<LogEntry> entry){
        String[] splited = string.split(" - ");
        if (splited.length != 3 ) return;
        try {
            LocalDateTime timestamp = LocalDateTime.parse(splited[0], FORMATTER);
            String levelString = splited[1].split(" ")[0];
            LogLevel level = LogLevel.getByValue(levelString);
            entry.add(new LogEntry(timestamp, level, splited[2]));
        }
        catch (DateTimeParseException ex ) {

        }
    }

}
