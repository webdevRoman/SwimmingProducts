package Iterator;

import java.util.LinkedList;

public class Flat2 {
  private int number;
  private int floor;
  private LinkedList<Room> rooms;
  public int getNumber() { return number; }
  public int getFloor() { return floor; }
  public LinkedList<Room> getRooms() { return rooms; }
  public Flat2(int number, int floor, LinkedList<Room> rooms) {
    this.number = number;
    this.floor = floor;
    this.rooms = rooms;
  }
}
