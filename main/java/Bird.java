import java.util.Objects;

abstract class Bird {
    String id;
    abstract void eat();
    abstract int getCount();
    abstract void incrementCount();
    abstract void decrementCount();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Objects.equals(id, bird.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

