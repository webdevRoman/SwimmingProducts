public abstract class Swimwear extends SwimmingProduct {

  public Swimwear() {}
  public Swimwear(String name, int price, String color, String manufacturer, String gender) {
    super(name, price, color, manufacturer);
    this.gender = gender;
  }

  protected String gender;

  public String getGender() { return gender; }
  public void setGender(String gender) { this.gender = gender; }

}