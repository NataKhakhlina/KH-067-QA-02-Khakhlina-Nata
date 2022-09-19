public abstract class Carnivores extends Animal {
    protected Carnivores(int age, int speed) {
        super(age, speed);
    }

    protected Carnivores(int age) {
        super(age);
    }

    public String getSound(){
        return "Rr-r-r...";
    }
}
