public class LegsDecorator2 extends Decorator {
  public LegsDecorator2(SwimmingProduct swimmingProduct) { super(swimmingProduct); }

  @Override
  public String train() {
    return super.train() + "(Эффективность тренировки ног повышена в 2 раза)";
  }
  @Override
  public String getName() {
    return this.swimmingProduct.getName();
  }
}
