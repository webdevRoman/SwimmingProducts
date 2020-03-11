import static java.lang.Thread.sleep;

public class Customer implements Runnable {
  private int productsNumber;
  private int consumedProductsNumber;
  private Warehouse warehouse;

  public Customer(int productsNumber, Warehouse warehouse) {
    this.productsNumber = productsNumber;
    this.consumedProductsNumber = 0;
    this.warehouse = warehouse;
  }
  @Override
  public void run() {
    try {
      while (this.consumedProductsNumber < this.productsNumber) {
        if (!this.warehouse.isEmpty()) {
          sleep(1000);
          SwimmingProduct product = this.warehouse.remove();
          System.out.println("Потреблен продукт:\t" + product.getName());

          /*    Приведение типов    */
          if (product.getClass().getSuperclass().getSimpleName() == "Decorator") {
            System.out.println(product.getClass().getSimpleName());
//            product.train();
          }

          this.consumedProductsNumber++;
        }
      }
    } catch (InterruptedException ex) {
      System.out.println("Customer thread was interrupted:");
      System.out.println(ex.getMessage());
    }
  }
}
