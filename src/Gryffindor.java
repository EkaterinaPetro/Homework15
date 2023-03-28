public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String firstName, String lastName, int magicPower,
                      int transgressionDistance, int nobility, int honor, int courage) {
        super(firstName, lastName, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return super.toString() + ", благородство " + nobility + ", честь " + honor + ", храбрость " + courage;
    }

    public static void compareStudents (Gryffindor gryffindor1, Gryffindor gryffindor2) {
        int sum1 = gryffindor1.nobility + gryffindor1.honor + gryffindor1.courage;
        int sum2 = gryffindor2.nobility + gryffindor2.honor + gryffindor2.courage;

        if (sum1 > sum2) {
            System.out.println(gryffindor1.getFirstName() + " " + gryffindor1.getLastName() +
                    " лучший Гриффиндорец, чем " + gryffindor2.getFirstName() + " " + gryffindor2.getLastName());
        } else if (sum1 < sum2) {
            System.out.println(gryffindor2.getFirstName() + " " + gryffindor2.getLastName() +
                    " лучший Гриффиндорец, чем " + gryffindor1.getFirstName() + " " + gryffindor1.getLastName());
        } else {
            System.out.println(gryffindor1.getFirstName() + " " + gryffindor1.getLastName() + " и "
                    + gryffindor2.getFirstName() + " " + gryffindor2.getLastName() + " на одном уровне");
        }
    }
}
