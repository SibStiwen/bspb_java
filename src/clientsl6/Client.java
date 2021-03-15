package clientsl6;

public abstract class Client implements Comparable<Client> {

    protected String name;
    protected int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public int compareTo(Client o) {
        if (age > o.age) return 1;
        if (age == o.age) return 0;
        else return -1;
    }
}
