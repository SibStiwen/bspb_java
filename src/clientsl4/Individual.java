package clientsl4;

import java.util.Objects;

public class Individual extends Client {

    private int ogrn;

    public Individual(String name, int age, int ogrn) {
        super(name, age);
        this.ogrn = ogrn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Individual client = (Individual) o;
        return ogrn == client.ogrn && age == client.age && name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ogrn, age);
    }

    @Override
    public String toString() {
        return String.format("%s ИП %s %s", this.name, this.age, this.ogrn);
    }



}
