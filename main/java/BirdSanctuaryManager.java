import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {
    Set<Bird> birdList = new HashSet<>();

    static BirdSanctuaryManager instance;

    static BirdSanctuaryManager getInstance() {
        if (instance == null) {
            instance = new BirdSanctuaryManager();
        }
        return instance;
    }

    public BirdSanctuaryManager() {

    }

    public void add(Bird bird) {
        try {
            if (bird == null) {
                throw new BirdSancturyException("Bird Not exist");
            } else {
                birdList.add(bird);
                bird.incrementCount();
            }
        }
        catch (BirdSancturyException e) {
            e.printStackTrace();
        }
    }

    public void remove(Bird bird) throws BirdSancturyException {
        if (birdList.contains(bird)) {
            birdList.remove(bird);
            bird.decrementCount();
        } else {
            throw new BirdSancturyException("did not find bird");
        }
    }

    public int getAllCount() {
        return birdList.size();
    }

    public void printFlyable() {
        birdList.stream().filter(bird -> bird instanceof Flyable)
                .forEach(bird -> ((Flyable)bird).fly());
        }

    public void printSwimmable() {
        birdList.stream().filter(bird -> bird instanceof Swimmable)
                .forEach(bird -> ((Swimmable)bird).swim());
    }

    public void printEatable() {
            birdList.stream().forEach(Bird::eat);
    }

    public static class getInstance extends BirdSanctuaryManager {
    }
}