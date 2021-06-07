public class Penguine extends Bird implements Swimmable {
    static int count = 0;

    public Penguine(String id) {
        this.id = id;
        this.color = "black&white";
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
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
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
