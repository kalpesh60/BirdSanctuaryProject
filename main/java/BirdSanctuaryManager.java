import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {
    //List<Bird> birdList = new ArrayList<Bird>();
    Set<Bird> birdList = new HashSet<>();

    public void add(Bird bird) {
        birdList.add(bird);
        bird.incrementCount();
    }

    public void remove(Bird bird) {
        birdList.remove(bird);
        bird.decrementCount();
    }

    public int getAllCount() {
        return birdList.size();
    }

    public void print() {
        for (Bird bird : birdList) {
            bird.eat();
            if (bird instanceof Flyable) {
                ((Flyable) bird).fly();
            }
            if (bird instanceof Swimmable) {
                ((Swimmable) bird).swim();
            }
        }
            //{
            //if (bird instanceof Parrot) {
              //  ((Parrot) bird).eat();
                //((Parrot) bird).fly();
                //((Parrot) bird).swim();
            //}
            //if (bird instanceof Duck) {
              //  ((Duck) bird).eat();
                //((Duck) bird).fly();
                //((Duck) bird).swim();
            //}
            //if (bird instanceof Penguine) {
              //  ((Penguine) bird).eat();
                //((Penguine) bird).swim();
            //}
    }
}
