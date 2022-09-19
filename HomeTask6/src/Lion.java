public class Lion extends Carnivores {
    protected Lion(int age, int speed) {
        super(age, speed);
    }

    protected Lion(int age) {
        super(age);
    }

    @Override
    public String getName() {
        return "Lion";
    }

    @Override
    public int getLifespan() {
        return 15;
    }
}
