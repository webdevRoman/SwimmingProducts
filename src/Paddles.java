public class Paddles extends SwimmingEquipment {

  public Paddles() {}
  public Paddles(String name, int price, String color, String manufacturer, String purpose, boolean small) {
    super(name, price, color, manufacturer, purpose);
    this.small = small;
  }

  private boolean small;

  public boolean isSmall() { return small; }
  public void setSmall(boolean small) { this.small = small; }

  public void showInfo() {
    System.out.println("Информация о товаре " + this.name + ":\nЦена: " + this.price + "\nПроизводитель: " + this.manufacturer + "\nЦвет: " + this.color + "\nНазначение: " + this.purpose + "\nМаленькие: " + (this.small ? "Да" : "Нет") + "\n");
  }

}