package Factory;

import Products.Fins;
import Products.Paddles;

public interface AbstractFactory {
  public Paddles producePaddles(String name, int price, String[] colors, String manufacturer, String purpose, String form);
  public Fins produceFins(String name, int price, String[] colors, String manufacturer, String purpose, String size);
}
