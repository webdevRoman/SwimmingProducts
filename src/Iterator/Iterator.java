package Iterator;

public interface Iterator {
  Room current();
  boolean hasNext();
  Room next();
  void rewind();
}
