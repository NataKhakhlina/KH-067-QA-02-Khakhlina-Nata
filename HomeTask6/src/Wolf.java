public class Wolf extends Carnivores {
    protected Wolf(int age, int speed) {
        super(age, speed);
    }

    protected Wolf(int age) {
        super(age);
    }

    @Override
    public String getSound() {
        return "W-o-o-f";
    }

    @Override
    public String getName() {
        return "Wolf";
    }

    @Override
    public int getLifespan() {
        return 16;
    }
}
