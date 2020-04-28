package Iterator;

import java.util.LinkedList;

public class Flat2Iterator implements Iterator {
  private LinkedList<Room> rooms;
  private int currentInd;
  public Flat2Iterator(Flat2 flat) {
    this.rooms = flat.getRooms();
    this.currentInd = 0;
  }

  @Override
  public Room current() { return rooms.get(currentInd); }
  @Override
  public boolean hasNext() { return currentInd < rooms.size(); }
  @Override
  public Room next() {
    if (currentInd == rooms.size())
      throw new IndexOutOfBoundsException("Перебор объектов завершён");
    Room room = rooms.get(currentInd);
    currentInd++;
    return room;
  }
  @Override
  public void rewind() { currentInd = 0; }
}
