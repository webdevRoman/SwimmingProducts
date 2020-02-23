public class SwimGoggles extends Swimwear {

  public SwimGoggles() {}
  public SwimGoggles(String name, int price, String color, String manufacturer, String gender, String type) {
    super(name, price, color, manufacturer, gender);
    this.type = type;
  }

  //  Тип (стартовые, тренировочные)
  private String type;

  public String getType() { return type; }
  public void setType(String type) { this.type = type; }

  @Override
  public void showInfo() {
    System.out.println("Информация о товаре " + this.name + ":\nЦена: " + this.price + "\nПроизводитель: " + this.manufacturer + "\nЦвет: " + this.color + "\nПол: " + this.gender + "\nТип: " + this.type + "\n");
  }

}