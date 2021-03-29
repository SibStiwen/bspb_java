import parser.LogEntry;
import parser.LogLevel;
import parser.LogUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static void main(String[] args) throws IOException {
        List<LogEntry> logs = new ArrayList<>();
        Path dir = Path.of("resources\\logs");

        Files.find(dir, 10, (file, attrs) -> file.toString().endsWith(".log"))
                .forEach(file -> {
                    try {
                        Files.lines(file)
                                .forEach(line -> LogUtils.addEntry(line, logs));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        logs.stream()
                .filter(line -> LogLevel.DEBUG == (line.getLevel()))
                .forEach(LogEntry::print);

    }
}
