package Builder;

import Products.SwimmingProduct;

import java.util.ArrayList;

public class SwimSet {
  private ArrayList<SwimmingProduct> items = new ArrayList<SwimmingProduct>();
  public ArrayList<SwimmingProduct> getItems() { return this.items; }
  public void setItems(ArrayList<SwimmingProduct> items) { this.items = items; }

  public void addItem(SwimmingProduct sp) {
    this.items.add(sp);
  }
  public void showItems() {
    String str = "";
    for (int i = 0; i < this.items.size(); i++)
      str += this.items.get(i).getName() + " (" + this.items.get(i).getManufacturer() + "); ";
    str = str.substring(0, str.length() - 2);
    System.out.println(str);
  }
}
