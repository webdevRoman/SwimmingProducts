package Iterator;

import java.util.ArrayList;

public class Flat1 {
  private int floor;
  private ArrayList<Room> rooms;
  public int getFloor() { return floor; }
  public ArrayList<Room> getRooms() { return rooms; }
  public Flat1(int floor, ArrayList<Room> rooms) {
    this.floor = floor;
    this.rooms = rooms;
  }
}
