package clients;

import java.util.Objects;

public class Client {

    private String name;
    private Gender gender;
    private int age;

    public Client(String name, Gender gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
        Client client = (Client) o;
        return gender == client.gender && age == client.age && name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.name, this.gender, this.age);
    }
}
