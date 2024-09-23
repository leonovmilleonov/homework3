package Exercise1;

public class Room {
    private final boolean isWalkThrough;

    public Room(boolean isWalkThrough) {
        this.isWalkThrough = isWalkThrough;
    }

    public void print() {
        System.out.print("Room is " + (isWalkThrough ? "walk-through" : "not walk-through"));
    }

    public boolean isWalkThrough() {
        return isWalkThrough;
    }
}
