package Iterator;

import java.util.LinkedList;

public class Flat2 {
  private int floor;
  private LinkedList<Room> rooms;
  public int getFloor() { return floor; }
  public LinkedList<Room> getRooms() { return rooms; }
  public Flat2(int floor, LinkedList<Room> rooms) {
    this.floor = floor;
    this.rooms = rooms;
  }
}
