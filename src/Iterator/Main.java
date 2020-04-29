package Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    String[] roomsNames = { "Кухня", "Коридор", "Ванная", "Туалет", "Гостинная", "Зал", "Детская", "Спальня" };

    ArrayList<Flat1> floor1Flats = new ArrayList<Flat1>();
    int flatsNumber = rand.nextInt(4) + 1;
    for (int i = 0; i < flatsNumber; i++) {
      ArrayList<Room> rooms = new ArrayList<Room>();
      int roomsNumber = rand.nextInt(4) + 2;
      for (int j = 0; j < roomsNumber; j++) {
        Room room = new Room(roomsNames[rand.nextInt(7)], rand.nextInt(30) + 10);
        rooms.add(room);
      }
      Flat1 flat = new Flat1(11 + i, 1, rooms);
      floor1Flats.add(flat);
    }

    ArrayList<Flat2> floor2Flats = new ArrayList<Flat2>();
    flatsNumber = rand.nextInt(4) + 1;
    for (int i = 0; i < flatsNumber; i++) {
      LinkedList<Room> rooms = new LinkedList<Room>();
      int roomsNumber = rand.nextInt(4) + 2;
      for (int j = 0; j < roomsNumber; j++) {
        Room room = new Room(roomsNames[rand.nextInt(7)], rand.nextInt(30) + 10);
        rooms.add(room);
      }
      Flat2 flat = new Flat2(21 + i, 2, rooms);
      floor2Flats.add(flat);
    }

    ArrayList<Flat3> floor3Flats = new ArrayList<Flat3>();
    flatsNumber = rand.nextInt(4) + 1;
    for (int i = 0; i < flatsNumber; i++) {
      HashMap<Integer, Room> rooms = new HashMap<Integer, Room>();
      int roomsNumber = rand.nextInt(4) + 2;
      for (int j = 0; j < roomsNumber; j++) {
        Room room = new Room(roomsNames[rand.nextInt(7)], rand.nextInt(30) + 10);
        rooms.put(j, room);
      }
      Flat3 flat = new Flat3(31 + i, 3, rooms);
      floor3Flats.add(flat);
    }


    System.out.println("Квартиры на 1 этаже:");
    for (Flat1 flat : floor1Flats) {
      Iterator iterator = new Flat1Iterator(flat);
      int commonArea = 0;
      System.out.println("Квартира номер " + flat.getNumber() + ":");
      while (iterator.hasNext()) {
        Room nextRoom = iterator.next();
        System.out.println(nextRoom.getName() + " (" + nextRoom.getArea() + "кв.м)");
        commonArea += nextRoom.getArea();
      }
      System.out.println("Общая площадь: " + commonArea + "кв.м\n-------------------------");
    }
    System.out.println("\n");

    System.out.println("Квартиры на 2 этаже:");
    for (Flat2 flat : floor2Flats) {
      Iterator iterator = new Flat2Iterator(flat);
      int commonArea = 0;
      System.out.println("Квартира номер " + flat.getNumber() + ":");
      while (iterator.hasNext()) {
        Room nextRoom = iterator.next();
        System.out.println(nextRoom.getName() + " (" + nextRoom.getArea() + "кв.м)");
        commonArea += nextRoom.getArea();
      }
      System.out.println("Общая площадь: " + commonArea + "кв.м\n-------------------------");
    }
    System.out.println("\n");

    System.out.println("Квартиры на 3 этаже:");
    for (Flat3 flat : floor3Flats) {
      Iterator iterator = new Flat3Iterator(flat);
      int commonArea = 0;
      System.out.println("Квартира номер " + flat.getNumber() + ":");
      while (iterator.hasNext()) {
        Room nextRoom = iterator.next();
        System.out.println(nextRoom.getName() + " (" + nextRoom.getArea() + "кв.м)");
        commonArea += nextRoom.getArea();
      }
      System.out.println("Общая площадь: " + commonArea + "кв.м\n-------------------------");
    }
  }
}
