public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String firstName, String lastName, int magicPower,
                     int transgressionDistance, int cunning, int determination,
                     int ambition, int resourcefulness, int lustForPower) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ", хитрость " + cunning + ", решительность " + determination + ", амбициозность " +
                ambition + ", находчивость " + resourcefulness + ", жажда власти " + lustForPower;
    }

    public static void compareStudents (Slytherin slytherin1, Slytherin slytherin2) {
        int sum1 = slytherin1.cunning + slytherin1.determination + slytherin1.ambition
                + slytherin1.resourcefulness + slytherin1.lustForPower;
        int sum2 = slytherin2.cunning + slytherin2.determination + slytherin2.ambition
                + slytherin2.resourcefulness + slytherin2.lustForPower;

        if (sum1 > sum2) {
            System.out.println(slytherin1.getFirstName() + " " + slytherin1.getLastName() +
                    " лучший Слизеринец, чем " + slytherin2.getFirstName() + " " + slytherin2.getLastName());
        } else if (sum1 < sum2) {
            System.out.println(slytherin2.getFirstName() + " " + slytherin2.getLastName() +
                    " лучший Слизеринец, чем " + slytherin1.getFirstName() + " " + slytherin1.getLastName());
        }else {
            System.out.println(slytherin1.getFirstName() + " " + slytherin1.getLastName() + " и "
                    + slytherin2.getFirstName() + " " + slytherin2.getLastName() + " на одном уровне");
        }
    }
}
