package Iterator;

import java.util.HashMap;

public class Flat3 {
  private int floor;
  private HashMap<Integer, Room> rooms;
  public int getFloor() { return floor; }
  public HashMap<Integer, Room> getRooms() { return rooms; }
  public Flat3(int floor, HashMap<Integer, Room> rooms) {
    this.floor = floor;
    this.rooms = rooms;
  }
}
