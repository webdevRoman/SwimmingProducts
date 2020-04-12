package Decorator;

import Products.SwimmingProduct;

public class Decorator extends SwimmingProduct {
  protected SwimmingProduct swimmingProduct;
  public Decorator(SwimmingProduct swimmingProduct) {
    this.swimmingProduct = swimmingProduct;
  }

  @Override
  public String train() {
    return this.swimmingProduct.train();
  }
  @Override
  public String getName() {
    return this.swimmingProduct.getName();
  }
}