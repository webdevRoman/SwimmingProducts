import Builder.BuildDirector;
import Builder.SwimSetBuilder;

public class Main {
  public static void main(String[] args) {
//    Builder
    SwimSetBuilder builder = new SwimSetBuilder();
    BuildDirector director = new BuildDirector();
    director.setBuilder(builder);
    System.out.println("Соберем базовый набор для плавания:");
    director.produceBasicSwimSet();
    builder.getProduct().showItems();
    builder.reset();

    System.out.println("Соберем продвинутый набор для плавания:");
    director.produceAdvancedSwimSet();
    builder.getProduct().showItems();
    builder.reset();

    System.out.println("Соберем полный набор для плавания:");
    director.produceFullSwimSet();
    builder.getProduct().showItems();
    builder.reset();
    System.out.println();


//    Вместимость склада
    int warehouseCapacity = 10;
//    Количество производимых товаров
    int productsToProduce = 15;

    Warehouse warehouse = new Warehouse(warehouseCapacity);
    Thread manufacturer = new Thread(new Manufacturer(productsToProduce, warehouse));
    Thread customer = new Thread(new Customer(productsToProduce, warehouse));
    manufacturer.start();
    customer.start();
  }
}