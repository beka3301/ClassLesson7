public class Universal {
    private String name;
    private int age;
    private boolean liveordead;

    public Universal(String name, int age, boolean liveordead) {
        this.name = name;
        this.age = age;
        this.liveordead = liveordead;
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

    public boolean isLiveordead() {
        return liveordead;
    }

    public void setLiveordead(boolean liveordead) {
        this.liveordead = liveordead;
    }

    @Override
    public String toString() {
        return "Universal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", liveordead=" + liveordead +
                '}';
    }
}
