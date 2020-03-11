public class HandsDecorator2 extends Decorator {
  public HandsDecorator2(SwimmingEquipment swimmingEquipment) { super(swimmingEquipment); }

  @Override
  public void train() {
    super.train();
    System.out.println("Эффективность тренировки рук повышена в 2 раза");
  }
  @Override
  public String getName() {
    return this.swimmingEquipment.getName();
  }
}
