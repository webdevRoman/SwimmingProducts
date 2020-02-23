public class PullFloat extends SwimmingEquipment {

  public PullFloat() {}
  public PullFloat(String name, int price, String color, String manufacturer, String purpose, String form) {
    super(name, price, color, manufacturer, purpose);
    this.form = form;
  }

  private String form;

  public String getForm() { return form; }
  public void setForm(String form) { this.form = form; }

  public void showInfo() {
    System.out.println("Информация о товаре " + this.name + ":\nЦена: " + this.price + "\nПроизводитель: " + this.manufacturer + "\nЦвет: " + this.color + "\nНазначение: " + this.purpose + "\nФорма: " + this.form + "\n");
  }

}