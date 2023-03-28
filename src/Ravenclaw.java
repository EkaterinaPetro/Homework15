public class Ravenclaw extends Hogwarts {
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String firstName, String lastName, int magicPower,
                     int transgressionDistance, int wisdom, int wit, int creativity) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", мудрость " + wisdom + ", остроумие " + wit + ", творчество " + creativity;
    }

    public static void compareStudents (Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        int sum1 = ravenclaw1.wisdom + ravenclaw1.wit + ravenclaw1.creativity;
        int sum2 = ravenclaw2.wisdom + ravenclaw2.wit + ravenclaw2.creativity;

        if (sum1 > sum2) {
            System.out.println(ravenclaw1.getFirstName() + " " + ravenclaw1.getLastName() +
                    " лучший Когтевранец, чем " + ravenclaw2.getFirstName() + " " + ravenclaw2.getLastName());
        } else if (sum1 < sum2) {
            System.out.println(ravenclaw2.getFirstName() + " " + ravenclaw2.getLastName() +
                    " лучший Когтевранец, чем " + ravenclaw1.getFirstName() + " " + ravenclaw1.getLastName());
        } else {
            System.out.println(ravenclaw1.getFirstName() + " " + ravenclaw1.getLastName() + " и "
                    + ravenclaw2.getFirstName() + " " + ravenclaw2.getLastName() + " на одном уровне");
        }
    }
}
