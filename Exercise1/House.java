package Exercise1;

public class House {
    private final int houseNumber;
    private final Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public void print() {
        System.out.printf("House number is %d, amount of floors is %d",
                houseNumber, floors.length);
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }
}
