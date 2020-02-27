public class Paddles extends SwimmingEquipment {

  public Paddles() {}
  public Paddles(String name, int price, String color, String manufacturer, String purpose, boolean small) {
    super(name, price, color, manufacturer, purpose);
    this.small = small;
  }

  private boolean small;

  public boolean isSmall() { return small; }
  public void setSmall(boolean small) { this.small = small; }

  @Override
  public void showInfo() {
    super.showInfo();
    System.out.println("Маленькие: " + (this.small ? "Да" : "Нет") + "\n");
  }

}