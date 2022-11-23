public class People {
    private String surname;
    private int age;

    private Baby baby;
    private Name names;

    public People(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public Name getNames() {
        return names;
    }

    public Baby getBaby() {
        return baby;
    }

    public int getAge() {
        return age;
    }
}
