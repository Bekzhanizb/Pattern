public abstract class player {
    String name;
    int age;
    int stamina;
    Stats stats;

    public player(String name, int age, int stamina, Stats stats) {
        this.name = name;
        this.age = age;
        this.stamina = stamina;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getStamina() {
        return stamina;
    }

    public abstract void play();
}
class Goalkeeper extends player {
    public Goalkeeper(String name, int age, int stamina, Stats stats) {
        super(name, age, stamina, stats);
    }
    @Override
    public void play() {
        System.out.println("Goalkeeper " + getName() + " is playing");
    }
}
class Striker extends player {
    public Striker(String name, int age, int stamina, Stats stats) {
        super(name, age, stamina, stats);
    }
    @Override
    public void play() {
        System.out.println("Striker " + getName() + " is playing");
    }
}
class Defender extends player {
    public Defender(String name, int age, int stamina, Stats stats) {
        super(name, age, stamina, stats);
    }
    @Override
    public void play() {
        System.out.println("Defender " + getName() + " is playing");
    }
}
class Midfielder extends player {
    public Midfielder(String name, int age, int stamina, Stats stats) {
        super(name, age, stamina, stats);
    }
    @Override
    public void play() {
        System.out.println("Midfielder " + getName() + " is playing");
    }
}