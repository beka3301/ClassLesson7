public class Fly extends Animal{
    public Fly(String name, int age, boolean liveordead, Country country) {
        super(name, age, liveordead, country);
    }
    public void fly(){
        System.out.println("воздушная атака ");
    }
}
