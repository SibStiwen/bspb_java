package parser;

public enum LogLevel {

    DEBUG("DEBUG"),
    WARN("WARN"),
    INFO("INFO"),
    ERROR("ERROR"),
    UNKNOWN("UNKNOWN");



    private String value;

    LogLevel(String value) {
        this.value = value;
    }

    public static LogLevel getByValue(String value){
        for ( LogLevel level : LogLevel.values()){
            if (level.value.equals(value)){
                return level;
            }
        }
        return LogLevel.UNKNOWN;
    }

    @Override
    public String toString() {
        return value;
    }
}
