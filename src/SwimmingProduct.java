public class SwimmingProduct {

  public SwimmingProduct() {}
  public SwimmingProduct(String name, int price, String color, String manufacturer) {
    this.name = name;
    this.price = price;
    this.color = color;
    this.manufacturer = manufacturer;
  }

  protected String name;
  protected int price;
  protected String color;
  protected String manufacturer;

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public int getPrice() { return price; }
  public void setPrice(int price) { this.price = price; }
  public String getColor() { return color; }
  public void setColor(String color) { this.color = color; }
  public String getManufacturer() { return manufacturer; }
  public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

  public void showInfo() {
    System.out.println("Информация о товаре " + this.name + ":\nЦена: " + this.price + "\nПроизводитель: " + this.manufacturer);
  }

}