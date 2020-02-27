import java.util.Random;

import static java.lang.Thread.sleep;

public class Manufacturer implements Runnable {
  private int productsNumber;
  private int producedProductsNumber;
  private Warehouse warehouse;

  public Manufacturer(int productsNumber, Warehouse warehouse) {
    this.productsNumber = productsNumber;
    this.producedProductsNumber = 0;
    this.warehouse = warehouse;
  }

  @Override
  public void run() {
    try {
      while (this.producedProductsNumber < this.productsNumber) {
        if (this.warehouse.hasSpace()) {
          sleep(500);
          SwimmingProduct product = this.produceProduct();
          this.warehouse.add(product);
          System.out.println("Произведен продукт:\t" + product.getName());
          this.producedProductsNumber++;
        }
      }
    } catch (InterruptedException ex) {
      System.out.println("Manufacturer thread was interrupted:");
      System.out.println(ex.getMessage());
    }
  }
  private SwimmingProduct produceProduct() {
    String[] swimsuitNames = { "Купальник 1", "Купальник 2", "Купальник 3" };
    String[] swimGogglesNames = { "Очки 1", "Очки 2", "Очки 3" };
    String[] swimCapNames = { "Шапочка 1", "Шапочка 2", "Шапочка 3" };
    String[] pullFloatNames = { "Колобашка 1", "Колобашка 2", "Колобашка 3" };
    String[] paddlesNames = { "Лопатки 1", "Лопатки 2", "Лопатки 3" };
    String[] kickboardNames = { "Доска 1", "Доска 2", "Доска 3" };
    String[] finsNames = { "Ласты 1", "Ласты 2", "Ласты 3" };
    String[] colors = { "Белый", "Черный", "Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый", "Разноцветный" };
    String[] manufacturers = { "Arena", "TYR", "Mad Wave", "Speedo", "Joss" };
    String[] genders = { "Мужской", "Женский", "Унисекс" };
    String[] sizes = { "XS", "S", "M", "L", "XL" };
    String[] gogglesTypes = { "Стартовые", "Тренировочные" };
    String[] capMaterials = { "Ткань", "Силикон" };
    String[] forms = { "Классическая", "Hydrofoil" };

    Random rand = new Random();
    int productType = rand.nextInt(6);
    SwimmingProduct product;
    switch (productType) {
      case 0:
//        System.out.println(0);
        product = new Swimsuit(swimsuitNames[rand.nextInt(2)], (rand.nextInt(1000) + 1) * 10, colors[rand.nextInt(9)], manufacturers[rand.nextInt(4)], genders[rand.nextInt(2)], rand.nextInt(20) + 30);
        break;
      case 1:
//        System.out.println(1);
        product = new SwimGoggles(swimGogglesNames[rand.nextInt(2)], (rand.nextInt(1000) + 1) * 10, colors[rand.nextInt(9)], manufacturers[rand.nextInt(4)], genders[rand.nextInt(2)], gogglesTypes[rand.nextInt(1)]);
        break;
      case 2:
//        System.out.println(2);
        product = new SwimCap(swimCapNames[rand.nextInt(2)], (rand.nextInt(1000) + 1) * 10, colors[rand.nextInt(9)], manufacturers[rand.nextInt(4)], genders[rand.nextInt(2)], capMaterials[rand.nextInt(1)]);
        break;
      case 3:
//        System.out.println(3);
        product = new PullFloat(pullFloatNames[rand.nextInt(2)], (rand.nextInt(1000) + 1) * 10, colors[rand.nextInt(9)], manufacturers[rand.nextInt(4)], "Тренировка рук", forms[rand.nextInt(1)]);
        break;
      case 4:
//        System.out.println(4);
        product = new Paddles(paddlesNames[rand.nextInt(2)], (rand.nextInt(1000) + 1) * 10, colors[rand.nextInt(9)], manufacturers[rand.nextInt(4)], "Тренировка рук", rand.nextBoolean());
        break;
      case 5:
//        System.out.println(5);
        product = new Kickboard(kickboardNames[rand.nextInt(2)], (rand.nextInt(1000) + 1) * 10, colors[rand.nextInt(9)], manufacturers[rand.nextInt(4)], "Тренировка ног", forms[rand.nextInt(1)]);
        break;
      case 6:
//        System.out.println(6);
        product = new Fins(finsNames[rand.nextInt(2)], (rand.nextInt(1000) + 1) * 10, colors[rand.nextInt(9)], manufacturers[rand.nextInt(4)], "Тренировка ног", sizes[rand.nextInt(4)], rand.nextBoolean());
        break;
      default:
//        System.out.println("default");
        product = new SwimmingProduct("Продукт для занятий плаванием", (rand.nextInt(1000) + 1) * 10, colors[rand.nextInt(9)], manufacturers[rand.nextInt(4)]);
        break;
    }
    return product;
  }
}
