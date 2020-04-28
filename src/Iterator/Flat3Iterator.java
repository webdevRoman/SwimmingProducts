package Iterator;

import java.util.HashMap;
import java.util.LinkedList;

public class Flat3Iterator implements Iterator {
  private HashMap<Integer, Room> rooms;
  private Integer[] roomsKeys;
  private int currentInd;
  private int currentKey;
  public Flat3Iterator(Flat3 flat) {
    this.rooms = flat.getRooms();
    this.roomsKeys = this.rooms.keySet().toArray(new Integer[0]);
    this.currentInd = 0;
    this.currentKey = this.roomsKeys[this.currentInd];
  }

  @Override
  public Room current() { return rooms.get(currentKey); }
  @Override
  public boolean hasNext() { return currentInd < rooms.size(); }
  @Override
  public Room next() {
    if (currentInd == rooms.size())
      throw new IndexOutOfBoundsException("Перебор объектов завершён");
    currentKey = roomsKeys[currentInd];
    Room room = rooms.get(currentKey);
    currentInd++;
    return room;
  }
  @Override
  public void rewind() {
    currentInd = 0;
    currentKey = roomsKeys[currentInd];
  }
}
