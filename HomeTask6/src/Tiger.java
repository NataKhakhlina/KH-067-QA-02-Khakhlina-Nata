public class Tiger extends Carnivores {
    protected Tiger(int age, int speed) {
        super(age, speed);
    }

    protected Tiger(int age) {
        super(age);
    }

    @Override
    public String getName() {
        return "Tiger";
    }

    @Override
    public int getLifespan() {
        return 10;
    }
}
