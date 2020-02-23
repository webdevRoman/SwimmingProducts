// Инвентарь для плавания
public abstract class SwimmingEquipment extends SwimmingProduct {

  public SwimmingEquipment() {}
  public SwimmingEquipment(String name, int price, String color, String manufacturer, String purpose) {
    super(name, price, color, manufacturer);
    this.purpose = purpose;
  }

  //  Назначение
  protected String purpose;

  public String getPurpose() { return purpose; }
  public void setPurpose(String purpose) { this.purpose = purpose; }

}