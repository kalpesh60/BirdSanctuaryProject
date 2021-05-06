public class MainClass {

    public static void main(String[] args) {
        System.out.println("Welcome to bird Sanctuary");

        BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
        Parrot parrot = new Parrot("p");
        Parrot parrot1 = new Parrot("p1");
        Parrot parrot2 = new Parrot("p2");
        Parrot parrot3 = new Parrot("p3");
        Duck duck = new Duck("d");
        Penguine penguin = new Penguine("pn");
        Crow crow = new Crow("c");

        birdSanctuaryManager.add(parrot);
        birdSanctuaryManager.add(parrot);
        birdSanctuaryManager.add(parrot1);
        birdSanctuaryManager.add(parrot2);
        birdSanctuaryManager.add(parrot3);
        birdSanctuaryManager.add(duck);
        birdSanctuaryManager.add(penguin);
        birdSanctuaryManager.add(crow);
        birdSanctuaryManager.remove(parrot);
        System.out.println("count of birds=" +birdSanctuaryManager.getAllCount());
        birdSanctuaryManager.print();
        System.out.println("count of parrot=" +parrot.getCount());
        System.out.println("count of penguines=" +penguin.getCount());
        System.out.println("count of ducks=" +duck.getCount());
        System.out.println("count of Crows=" +crow.getCount());
    }
}