public class Decorator extends SwimmingEquipment {
  protected SwimmingEquipment swimmingEquipment;
  public Decorator(SwimmingEquipment swimmingEquipment) {
    this.swimmingEquipment = swimmingEquipment;
  }

  @Override
  public void train() {
    this.swimmingEquipment.train();
  }
  @Override
  public String getName() {
    return this.swimmingEquipment.getName();
  }
}