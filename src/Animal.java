public class Animal extends Universal{
    private Country country;

    public Animal(Country country,String name, int age, boolean liveordead) {
        super(name, age, liveordead);
        this.country=country;
    }

    public Animal(String name, int age, boolean liveordead, Country country) {
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
        return "Animal{" +
                "country=" + country +
                super.toString()+
                '}';
    }
}
