package clientsl6;

public enum Gender {
    MALE("М"),
    FEMALE("Ж");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}