public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName, int magicPower,
                      int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", трудолюбие " + hardWork + ", верность " + loyalty + ", честность " + honesty;
    }

    public static void compareStudents (Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        int sum1 = hufflepuff1.hardWork + hufflepuff1.loyalty + hufflepuff1.honesty;
        int sum2 = hufflepuff2.hardWork + hufflepuff2.loyalty + hufflepuff2.honesty;

        if (sum1 > sum2) {
            System.out.println(hufflepuff1.getFirstName() + " " + hufflepuff1.getLastName() +
                    " лучший Пуффендуец, чем " + hufflepuff2.getFirstName() + " " + hufflepuff2.getLastName());
        } else if (sum1 < sum2) {
            System.out.println(hufflepuff2.getFirstName() + " " + hufflepuff2.getLastName() +
                    " лучший Пуффендуец, чем " + hufflepuff1.getFirstName() + " " + hufflepuff1.getLastName());
        } else {
            System.out.println(hufflepuff1.getFirstName() + " " + hufflepuff1.getLastName() + " и "
                    + hufflepuff2.getFirstName() + " " + hufflepuff2.getLastName() + " на одном уровне");
        }
    }
}
