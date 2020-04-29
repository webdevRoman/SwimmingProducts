package Iterator;

import java.util.ArrayList;

public class Flat1 {
  private int number;
  private int floor;
  private ArrayList<Room> rooms;
  public int getNumber() { return number; }
  public int getFloor() { return floor; }
  public ArrayList<Room> getRooms() { return rooms; }
  public Flat1(int number, int floor, ArrayList<Room> rooms) {
    this.number = number;
    this.floor = floor;
    this.rooms = rooms;
  }
}
