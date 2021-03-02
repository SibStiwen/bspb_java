package clientsl4;

import java.util.Objects;

public class Phisical extends Client {

    private Gender gender;

    public Phisical(String name, int age, Gender gender) {
        super(name,age);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phisical client = (Phisical) o;
        return gender == client.gender && age == client.age && name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }

    @Override
    public String toString() {
        return String.format("%s ФЛ %s %s", this.name, this.age, this.gender);
    }



}
