package Factory;

import Products.BigFins;
import Products.BigPaddles;
import Products.Fins;
import Products.Paddles;

public class BigFactory implements AbstractFactory {
  @Override
  public Paddles producePaddles(String name, int price, String[] colors, String manufacturer, String purpose, String form) {
    return new BigPaddles(name, price, colors, manufacturer, purpose, form);
  }
  @Override
  public Fins produceFins(String name, int price, String[] colors, String manufacturer, String purpose, String size) {
    return new BigFins(name, price, colors, manufacturer, purpose, size);
  }
}
