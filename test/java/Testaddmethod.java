import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testaddmethod {
    @Test
    public void addMethod(){
        BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
        Parrot parrot = new Parrot("p");
        birdSanctuaryManager.add(parrot);
        int result= birdSanctuaryManager.getAllCount();
        Assertions.assertEquals(1,result);
    }

    @Test
    void givenValueNull_Should_ThrowException() {
        BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager.getInstance();
        birdSanctuaryManager.add(null);
        int result = birdSanctuaryManager.getAllCount();
        Assertions.assertEquals(0,result);
    }

    @Test
    void givenValue_Should_ThrowCustomException() {
        BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
        Parrot parrot = new Parrot("p");
        Assertions.assertThrows( BirdSancturyException.class,() -> {birdSanctuaryManager.remove(parrot);});
    }
}
