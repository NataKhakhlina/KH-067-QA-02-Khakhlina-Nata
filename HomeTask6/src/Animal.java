public abstract class Animal {
    private int age;
    private int speed;

    protected Animal(int age, int speed) {
        this.age = age;
        this.speed = speed;
    }

    public int getRestOfLife(){
        return getLifespan() - getAge();
    }

    protected Animal(int age) {
        this.age = age;
        speed = 0;
    }

    public int getAge() {
        return age;
    }

    public abstract String getName();
    public abstract int getLifespan();

    public int getSpeed() {
        return speed;
    }
}
