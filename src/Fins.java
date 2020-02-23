public class Fins extends SwimmingEquipment {

  public Fins() {}
  public Fins(String name, int price, String color, String manufacturer, String purpose, String size, boolean small) {
    super(name, price, color, manufacturer, purpose);
    this.size = size;
    this.small = small;
  }

  private String size;
  private boolean small;

  public String getSize() { return size; }
  public void setSize(String size) { this.size = size; }
  public boolean isSmall() { return small; }
  public void setSmall(boolean small) { this.small = small; }

  public void showInfo() {
    System.out.println("Информация о товаре " + this.name + ":\nЦена: " + this.price + "\nПроизводитель: " + this.manufacturer + "\nЦвет: " + this.color + "\nНазначение: " + this.purpose + "\nКороткие: " + (this.small ? "Да" : "Нет") + "\n");
  }

}