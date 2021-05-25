public class BirdFactory {

    public Bird getBird(String birds,String name) {
        switch (birds) {
            case "parrot":
                return new Parrot(name);
            case "duck":
                return new Duck(name);
            case "penguine":
                return new Penguine(name);
            case "crow":
                return new Crow(name);
            default:
                return null;
        }
    }
}
