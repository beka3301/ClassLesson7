public class Main {
    public static void main(String[] args) {
        Football football=new Football("Messi",35,true,new Country("Argentina",56989,7000000000l));
        System.out.println(football);
        football.Play();
        Moldo moldo=new Moldo("Чубак ажы",60,false,new Country("Kyrgyzstan",123456,2000000000l));
        System.out.println(moldo);
        moldo.Learn();
        Scoolboy scoolboy=new Scoolboy("Bektur",24,true,new Country("Kyrgyzstan",123456,2000000000l));
        System.out.println(scoolboy);
        scoolboy.character();
        Fishes fishes=new Fishes("Сквидвард",400,true,new Country("Japan",412359,900000000l));
        System.out.println(fishes);
        fishes.lifeWater();
        Mammals mammals=new Mammals("Петя",10,true,new Country("Africa",2323232,500000000l));
        System.out.println(mammals);
        mammals.mal();
        Fly fly=new Fly("Валера",100,false,new Country("Kyrgyzstan",123456,200000000l));
        System.out.println(fly);
        fly.fly();

    }
}