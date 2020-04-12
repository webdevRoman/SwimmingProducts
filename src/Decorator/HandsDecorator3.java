package Decorator;

import Products.SwimmingProduct;

public class HandsDecorator3 extends Decorator {
  public HandsDecorator3(SwimmingProduct swimmingProduct) {
    super(swimmingProduct);
  }

  @Override
  public String train() {
    return super.train() + "(Эффективность тренировки рук повышена в 3 раза)";
  }
  @Override
  public String getName() {
    return this.swimmingProduct.getName();
  }
}
