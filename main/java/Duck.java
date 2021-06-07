public class Duck extends Bird implements Flyable, Swimmable {
    static int count = 0;

    public Duck(String id) {
        this.id = id;
        this.color = "white";
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    void decrementCount() {
        count--;
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
