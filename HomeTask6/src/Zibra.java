public class Zibra extends Herbivores {
    protected Zibra(int age, int speed) {
        super(age, speed);
    }

    protected Zibra(int age) {
        super(age);
    }

    @Override
    public String getName() {
        return "Zibra";
    }

    @Override
    public int getLifespan() {
        return 12;
    }
}
