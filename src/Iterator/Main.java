package Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    String[] roomsNames = { "Кухня", "Коридор", "Ванная", "Туалет", "Гостинная", "Зал", "Детская", "Спальня" };

    ArrayList<Room> rooms1 = new ArrayList<Room>();
    for (int i = 0; i < 5; i++) {
      Room room = new Room(roomsNames[rand.nextInt(7)], rand.nextInt(30) + 10);
      rooms1.add(room);
    }
    Flat1 flat1 = new Flat1(1, rooms1);

    LinkedList<Room> rooms2 = new LinkedList<Room>();
    for (int i = 0; i < 5; i++) {
      Room room = new Room(roomsNames[rand.nextInt(7)], rand.nextInt(30) + 10);
      rooms2.add(room);
    }
    Flat2 flat2 = new Flat2(2, rooms2);

    HashMap<Integer, Room> rooms3 = new HashMap<Integer, Room>();
    for (int i = 0; i < 5; i++) {
      Room room = new Room(roomsNames[rand.nextInt(7)], rand.nextInt(30) + 10);
      rooms3.put(i, room);
    }
    Flat3 flat3 = new Flat3(3, rooms3);

    Iterator iterator1 = new Flat1Iterator(flat1);
    Iterator iterator2 = new Flat2Iterator(flat2);
    Iterator iterator3 = new Flat3Iterator(flat3);

    System.out.println("Комнаты квартиры на " + flat1.getFloor() + " этаже:");
    int commonArea1 = 0;
    while (iterator1.hasNext()) {
      Room nextRoom = iterator1.next();
      System.out.println(nextRoom.getName() + " (" + nextRoom.getArea() + "кв.м)");
      commonArea1 += nextRoom.getArea();
    }
    System.out.println("Общая площадь: " + commonArea1 + "кв.м\n");

    System.out.println("Комнаты квартиры на " + flat2.getFloor() + " этаже:");
    int commonArea2 = 0;
    while (iterator2.hasNext()) {
      Room nextRoom = iterator2.next();
      System.out.println(nextRoom.getName() + " (" + nextRoom.getArea() + "кв.м)");
      commonArea2 += nextRoom.getArea();
    }
    System.out.println("Общая площадь: " + commonArea2 + "кв.м\n");

    System.out.println("Комнаты квартиры на " + flat3.getFloor() + " этаже:");
    int commonArea3 = 0;
    while (iterator3.hasNext()) {
      Room nextRoom = iterator3.next();
      System.out.println(nextRoom.getName() + " (" + nextRoom.getArea() + "кв.м)");
      commonArea3 += nextRoom.getArea();
    }
    System.out.println("Общая площадь: " + commonArea3 + "кв.м");
  }
}
