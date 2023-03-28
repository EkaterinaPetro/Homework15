public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", 38,
                71, 95, 51, 31);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 48,
                72, 3, 72, 7);
        Gryffindor ronWeasley = new Gryffindor("Рон", "Уизли", 79,
                52, 1, 36, 28);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария", "Смит", 14,
                58, 95, 98, 36);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", 32,
                61, 39, 7, 34);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 65,
                28, 52, 28, 93);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу", "Чанг", 80,
                90, 68, 100, 27);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил ", 44,
                48, 94, 4, 87);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 52,
                49, 93, 73, 10);

        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 94,
                94, 74, 67, 94, 90, 96);
        Slytherin grahamMontagu = new Slytherin("Грэм", "Монтегю", 70,
                21, 19, 99, 5, 29, 54);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 76,
                15, 76, 25, 94, 71, 19);

        System.out.println(dracoMalfoy.toString());
        Gryffindor.compareStudents(harryPotter, hermioneGranger);
        Hufflepuff.compareStudents(zachariasSmith, cedricDiggory);
        Ravenclaw.compareStudents(zhouChang, padmaPatil);
        Slytherin.compareStudents(grahamMontagu, gregoryGoyle);
        Hogwarts.compareStudents(cedricDiggory, ronWeasley);
    }
}