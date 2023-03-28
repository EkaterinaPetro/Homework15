public class Hogwarts {
    private String firstName;
    private String lastName;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String firstName, String lastName, int magicPower, int transgressionDistance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ": сила магии " + magicPower +
                ", расстояние трансгрессии " + transgressionDistance;
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.magicPower > student2.magicPower) {
            System.out.println(student1.firstName + " " + student1.lastName +
                    " обладает бОльшей мощностью магии, чем " + student2.firstName + " " + student2.lastName);
        }else if (student1.magicPower < student2.magicPower) {
            System.out.println(student2.firstName + " " + student2.lastName +
                    " обладает бОльшей мощностью магии, чем " + student1.firstName + " " + student1.lastName);
        } else {
            System.out.println(student1.getFirstName() + " " + student1.getLastName() + " и "
                    + student2.getFirstName() + " " + student2.getLastName() + " обладают одинаковой можноостью магии");
        }

        if (student1.transgressionDistance > student2.transgressionDistance) {
            System.out.println(student1.firstName + " " + student1.lastName +
                    " обладает бОльшим расстоянием трансгрессии, чем " + student2.firstName + " " + student2.lastName);
        } else if (student1.transgressionDistance < student2.transgressionDistance) {
            System.out.println(student2.firstName + " " + student2.lastName +
                    " обладает бОльшим расстоянием трансгрессии, чем " + student1.firstName + " " + student1.lastName);
        } else {
            System.out.println(student1.getFirstName() + " " + student1.getLastName() + " и "
                    + student2.getFirstName() + " " + student2.getLastName() +
                    " обладают одинаковым расстоянием трансгрессии");
        }
    }
}
