public class HandsDecorator3 extends Decorator {
  public HandsDecorator3(SwimmingEquipment swimmingEquipment) {
    super(swimmingEquipment);
  }

  @Override
  public void train() {
    super.train();
    System.out.println("Эффективность тренировки рук повышена в 3 раза");
  }
  @Override
  public String getName() {
    return this.swimmingEquipment.getName();
  }
}
