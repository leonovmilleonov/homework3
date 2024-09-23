package Exercise1;

public class Flat {
    private final int flatNumber;
    private final Room[] rooms;

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public void print() {
        System.out.printf("Flat number is %d, amount of rooms is %d",
                flatNumber, rooms.length);
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }
}
