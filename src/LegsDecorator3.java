public class LegsDecorator3 extends Decorator {
  public LegsDecorator3(SwimmingProduct swimmingProduct) {
    super(swimmingProduct);
  }

  @Override
  public String train() {
    return super.train() + "(Эффективность тренировки ног повышена в 3 раза)";
  }
  @Override
  public String getName() {
    return this.swimmingProduct.getName();
  }
}
