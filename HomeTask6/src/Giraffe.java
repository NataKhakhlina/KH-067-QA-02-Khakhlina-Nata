public class Giraffe extends Herbivores {
    protected Giraffe(int age, int speed) {
        super(age, speed);
    }

    protected Giraffe(int age) {
        super(age);
    }

    @Override
    public String getName() {
        return "Gireffe";
    }

    @Override
    public int getLifespan() {
        return 20;
    }
}
