package clients;

import java.util.Objects;

public class Client {
    public static final boolean MAN = true;
    public static final boolean WOMAN = false;

    private String name;
    private boolean sex;
    private int age;

    public Client(String name, boolean sex, int age) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return sex == client.sex && age == client.age && name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }

    @Override
    public String toString() {
        char sex = this.sex ? 'М' : 'Ж';
        return String.format("%s %s %s", this.name, sex, this.age);
    }
}
