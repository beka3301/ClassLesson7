public class Football extends Person{

    public Football(String name, int age, boolean liveordead, Country country) {
        super(name, age, liveordead, country);
    }
    public void Play(){
        System.out.println("гоняет мяч по полю");
    }
}
