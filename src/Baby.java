public class Baby extends Child {
    public Baby(String surname, int age) {
        super(surname, age);
    }

    @Override
    public String life(int age, String surname) {
        return super.life(age, surname);
    }
}
