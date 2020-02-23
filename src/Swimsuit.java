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
    System.out.println("Информация о товаре " + this.name + ":\nЦена: " + this.price + "\nПроизводитель: " + this.manufacturer + "\nЦвет: " + this.color + "\nПол: " + this.gender + "\nРазмер: " + this.size + "\n");
  }

}