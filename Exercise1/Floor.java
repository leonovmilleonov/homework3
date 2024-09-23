package Exercise1;

public class Floor {
    private final int floorNumber;
    private final Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public void print() {
        System.out.printf("Floor number is %d, amount of flats is %d",
                floorNumber, flats.length);
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }
}
