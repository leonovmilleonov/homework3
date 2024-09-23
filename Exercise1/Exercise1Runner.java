package Exercise1;

/*
Представить в виде классов и их композиции следующую модель.
- Каждый дом содержит свой номер (int), и множество этажей (массив).
- Каждый этаж содержит номер этажа (int), и множество квартир (массив).
- Каждая квартира содержит свой номер (int), и множество комнат (массив).
- Каждая комната содержит поле проходная она или нет (boolean).
В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
Например, метод print класса этаж должен выводить на консоль:
“Этаж 2, количество квартир 18”
Создание всех объектов вынести в отдельный класс с методом main.
Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */

public class Exercise1Runner {
    public static void main(String[] args) {
        //for test
        Flat flat1 = new Flat(1, new Room[]{new Room(false), new Room(true)});
        Flat flat2 = new Flat(2, new Room[]{new Room(false), new Room(false), new Room(true)});
        Flat flat3 = new Flat(3, new Room[]{new Room(false), new Room(true)});
        Flat flat4 = new Flat(4, new Room[]{new Room(false), new Room(true), new Room(false)});
        Floor floor1 = new Floor(1, new Flat[]{flat1, flat2});
        Floor floor2 = new Floor(2, new Flat[]{flat3, flat4});
        House house = new House(13, new Floor[]{floor1, floor2});
        printAllInformation(house);
    }
    public static void printAllInformation(House house){
        house.print();
        System.out.println();
        for(Floor currentFloor : house.getFloors()) {
            currentFloor.print();
            System.out.println();
            for (Flat currentFlat : currentFloor.getFlats() ) {
                currentFlat.print();
                System.out.print(". ");
                for(Room currentRoom: currentFlat.getRooms()){
                    currentRoom.print();
                    System.out.print(". ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
