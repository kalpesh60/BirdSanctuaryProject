public class MainClass {

    public static void main(String[] args) throws BirdSancturyException {
        System.out.println("Welcome to bird Sanctuary");

        BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
        BirdFactory birdFactory = new BirdFactory();

        Bird parrot = birdFactory.getBird("parrot","p");
        Bird parrot1 = birdFactory.getBird("parrot", "p1");
        Bird parrot2 = birdFactory.getBird("parrot","p2");
        Bird parrot3 = birdFactory.getBird("parrot", "p3");
        Bird duck = birdFactory.getBird("duck", "d");
        Bird penguine = birdFactory.getBird("penguine", "pg");
        Bird crow = birdFactory.getBird("crow", "c");

        birdSanctuaryManager.add(parrot);
        birdSanctuaryManager.add(parrot1);
        birdSanctuaryManager.add(parrot2);
        birdSanctuaryManager.add(parrot3);
        birdSanctuaryManager.add(parrot);
        birdSanctuaryManager.add(duck);
        birdSanctuaryManager.add(penguine);
        birdSanctuaryManager.add(crow);
        birdSanctuaryManager.remove(parrot);
        System.out.println("count of birds=" +birdSanctuaryManager.getAllCount());

        birdSanctuaryManager.printFlyable();
        birdSanctuaryManager.printSwimmable();
        birdSanctuaryManager.printEatable();

        birdSanctuaryManager.saveBirdsInFile();
        birdSanctuaryManager.PrintBirdColor();

        System.out.println("count of parrot=" +parrot.getCount());
        System.out.println("count of penguines=" +penguine.getCount());
        System.out.println("count of ducks=" +duck.getCount());
        System.out.println("count of Crows=" +crow.getCount());
    }
}