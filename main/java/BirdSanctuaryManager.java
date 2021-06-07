import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    public void PrintBirdColor () {
        birdList.toString();
        System.out.println(birdList);
    }

    public void saveBirdsInFile() {
        StringBuffer birdBuffer = new StringBuffer();
        birdList.forEach(bird -> {
            String birdDataString = bird.toString().concat("\n");
            birdBuffer.append(birdDataString);
        });
        try {
            Files.write(Paths.get("bird.txt"), birdBuffer.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
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