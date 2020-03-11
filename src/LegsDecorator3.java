public class LegsDecorator3 extends Decorator {
  public LegsDecorator3(SwimmingEquipment swimmingEquipment) {
    super(swimmingEquipment);
  }

  @Override
  public void train() {
    super.train();
    System.out.println("Эффективность тренировки ног повышена в 3 раза");
  }
  @Override
  public String getName() {
    return this.swimmingEquipment.getName();
  }
}
