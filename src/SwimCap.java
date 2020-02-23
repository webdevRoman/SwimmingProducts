public class SwimCap extends Swimwear {

  public SwimCap() {}
  public SwimCap(String name, int price, String color, String manufacturer, String gender, String material) {
    super(name, price, color, manufacturer, gender);
    this.material = material;
  }

  private String material;

  public String getMaterial() { return material; }
  public void setMaterial(String material) { this.material = material; }

  @Override
  public void showInfo() {
    System.out.println("Информация о товаре " + this.name + ":\nЦена: " + this.price + "\nПроизводитель: " + this.manufacturer + "\nЦвет: " + this.color + "\nПол: " + this.gender + "\nМатериал: " + this.material + "\n");
  }

}