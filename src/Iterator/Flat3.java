package Iterator;

import java.util.HashMap;

public class Flat3 {
  private int number;
  private int floor;
  private HashMap<Integer, Room> rooms;
  public int getNumber() { return number; }
  public int getFloor() { return floor; }
  public HashMap<Integer, Room> getRooms() { return rooms; }
  public Flat3(int number, int floor, HashMap<Integer, Room> rooms) {
    this.number = number;
    this.floor = floor;
    this.rooms = rooms;
  }
}
