public class LegsDecorator2 extends Decorator {
  public LegsDecorator2(SwimmingEquipment swimmingEquipment) { super(swimmingEquipment); }

  @Override
  public void train() {
    super.train();
    System.out.println("Эффективность тренировки ног повышена в 2 раза");
  }
  @Override
  public String getName() {
    return this.swimmingEquipment.getName();
  }
}
