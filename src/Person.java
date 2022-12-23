public class Person extends Universal {

    private Country country;

    public Person(String name, int age, boolean liveordead, Country country) {
        super(name, age, liveordead);
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "country=" + country +
                super.toString()+
                '}';
    }
}

