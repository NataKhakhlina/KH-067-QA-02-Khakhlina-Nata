public class Main {
    public static void main(String[] args) {
        Zibra zibra1 = new Zibra(2, 6);
        System.out.println("Rest of life for " + zibra1.getName() + " is " + zibra1.getRestOfLife() + " years");

        Tiger tiger1 = new Tiger(2, 6);
        System.out.println("Rest of life for " + tiger1.getName() + " is " + tiger1.getRestOfLife() + " years");

        Lion lion1 = new Lion(2, 6);
        System.out.println("Rest of life for " + lion1.getName() + " is " + lion1.getRestOfLife() + " years");

        Wolf wolf = new Wolf(3, 25);
        System.out.println("Wolf run with speed " + wolf.getSpeed() + " and make sound " + wolf.getSound() +".");
    }
}
