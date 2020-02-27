// Купальник
public class Swimsuit extends Swimwear {

  public Swimsuit() {}
  public Swimsuit(String name, int price, String color, String manufacturer, String gender, int size) {
    super(name, price, color, manufacturer, gender);
    this.size = size;
  }

  private int size;

  public int getSize() { return size; }
  public void setSize(int size) { this.size = size; }

  @Override
  public void showInfo() {
    super.showInfo();
    System.out.println("Размер: " + this.size + "\n");
  }

}