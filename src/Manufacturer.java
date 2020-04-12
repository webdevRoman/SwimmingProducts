import Decorator.HandsDecorator2;
import Decorator.HandsDecorator3;
import Decorator.LegsDecorator2;
import Decorator.LegsDecorator3;
import Factory.BigFactory;
import Factory.SmallFactory;
import Products.*;

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
          System.out.println("[Произведен продукт: " + product.getName() + " (" + product.getManufacturer() + ")]");
          this.producedProductsNumber++;
        }
      }
    } catch (InterruptedException ex) {
      System.out.println("Manufacturer thread was interrupted:");
      System.out.println(ex.getMessage());
    }
  }
//  Абстрактная фабрика используется при производстве лопаток (case 4) и ласт (case 6)
  private SwimmingProduct produceProduct() {
//    String[] swimsuitNames = {"Купальник 1", "Купальник 2", "Купальник 3"};
//    String[] swimGogglesNames = {"Очки 1", "Очки 2", "Очки 3"};
//    String[] swimCapNames = {"Шапочка 1", "Шапочка 2", "Шапочка 3"};
//    String[] pullFloatNames = {"Колобашка 1", "Колобашка 2", "Колобашка 3"};
//    String[] paddlesNames = {"Лопатки 1", "Лопатки 2", "Лопатки 3"};
//    String[] kickboardNames = {"Доска 1", "Доска 2", "Доска 3"};
//    String[] finsNames = {"Ласты 1", "Ласты 2", "Ласты 3"};
//    String[] colors = {"Белый", "Черный", "Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый", "Разноцветный"};
//    String[] manufacturers = {"Arena", "TYR", "Mad Wave", "Speedo", "Joss"};
//    String[] genders = {"Мужской", "Женский", "Унисекс"};
//    String[] sizes = {"XS", "S", "M", "L", "XL"};
//    String[] gogglesTypes = {"Стартовые", "Тренировочные"};
//    String[] capMaterials = {"Ткань", "Силикон"};
//    String[] forms = {"Классическая", "Hydrofoil"};
//
//    Random rand = new Random();
    int productType = ProductsData.RAND.nextInt(7);
    SwimmingProduct product;
    String[] prodColors = {ProductsData.COLORS[ProductsData.RAND.nextInt(9)]};
    int prodPrice = (ProductsData.RAND.nextInt(1000) + 1) * 10;
    String prodManufacturer = ProductsData.MANUFACTURERS[ProductsData.RAND.nextInt(4)];
    switch (productType) {
      case 0:
        product = new Swimsuit(ProductsData.SWIMSUIT_NAMES[ProductsData.RAND.nextInt(2)], prodPrice, prodColors, prodManufacturer, ProductsData.GENDERS[ProductsData.RAND.nextInt(2)], ProductsData.RAND.nextInt(20) + 30);
        break;
      case 1:
        product = new SwimGoggles(ProductsData.SWIMGOGGLES_NAMES[ProductsData.RAND.nextInt(2)], prodPrice, prodColors, prodManufacturer, ProductsData.GENDERS[ProductsData.RAND.nextInt(2)], ProductsData.GOGGLES_TYPES[ProductsData.RAND.nextInt(1)]);
        break;
      case 2:
        product = new SwimCap(ProductsData.SWIMCAP_NAMES[ProductsData.RAND.nextInt(2)], prodPrice, prodColors, prodManufacturer, ProductsData.GENDERS[ProductsData.RAND.nextInt(2)], ProductsData.CAP_MATERIALS[ProductsData.RAND.nextInt(1)]);
        break;
      case 3:
        product = new PullFloat(ProductsData.PULLFLOAT_NAMES[ProductsData.RAND.nextInt(2)], prodPrice, prodColors, prodManufacturer, "Тренировка рук", ProductsData.FORMS[ProductsData.RAND.nextInt(1)]);
        product = new HandsDecorator2((PullFloat) product);
        break;
      case 4:
        boolean paddlesSmall = ProductsData.RAND.nextBoolean();
        if (paddlesSmall) {
          SmallFactory sf = new SmallFactory();
          product = sf.producePaddles(ProductsData.PADDLES_NAMES[ProductsData.RAND.nextInt(2)], prodPrice, prodColors, prodManufacturer, "Тренировка рук", "Плоские");
          product = new HandsDecorator2((Paddles) product);
        } else {
          BigFactory bf = new BigFactory();
          product = bf.producePaddles(ProductsData.PADDLES_NAMES[ProductsData.RAND.nextInt(2)], prodPrice, prodColors, prodManufacturer, "Тренировка рук", "Под форму руки");
          product = new HandsDecorator3((Paddles) product);
        }
        break;
      case 5:
        product = new Kickboard(ProductsData.KICKBOARD_NAMES[ProductsData.RAND.nextInt(2)], prodPrice, prodColors, prodManufacturer, "Тренировка ног", ProductsData.FORMS[ProductsData.RAND.nextInt(1)]);
        product = new LegsDecorator2((Kickboard) product);
        break;
      case 6:
        boolean finsSmall = ProductsData.RAND.nextBoolean();
        if (finsSmall) {
          SmallFactory sf = new SmallFactory();
          product = sf.produceFins(ProductsData.FINS_NAMES[ProductsData.RAND.nextInt(2)], prodPrice, prodColors, prodManufacturer, "Тренировка ног", ProductsData.SIZES[ProductsData.RAND.nextInt(4)]);
          product = new LegsDecorator2((Fins) product);
        } else {
          BigFactory bf = new BigFactory();
          product = bf.produceFins(ProductsData.FINS_NAMES[ProductsData.RAND.nextInt(2)], prodPrice, prodColors, prodManufacturer, "Тренировка ног", ProductsData.SIZES[ProductsData.RAND.nextInt(4)]);
          product = new LegsDecorator3((Fins) product);
        }
        break;
      default:
        product = new SwimmingProduct("Продукт для занятий плаванием", prodPrice, prodColors, prodManufacturer);
        break;
    }
    return product;
  }
}
