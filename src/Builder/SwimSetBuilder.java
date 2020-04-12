package Builder;

import Decorator.HandsDecorator2;
import Decorator.HandsDecorator3;
import Decorator.LegsDecorator2;
import Decorator.LegsDecorator3;
import Factory.BigFactory;
import Factory.SmallFactory;
import Products.*;

public class SwimSetBuilder {
  private SwimSet swimSet;
  public SwimSetBuilder() {
    this.reset();
  }

  public void reset() {
    swimSet = new SwimSet();
  }

  public SwimSet getProduct() {
    return this.swimSet;
  }

  public void produceSwimsuit() {
    this.swimSet.addItem(new Swimsuit(ProductsData.SWIMSUIT_NAMES[ProductsData.RAND.nextInt(2)], (ProductsData.RAND.nextInt(1000) + 1) * 10, new String[]{ProductsData.COLORS[ProductsData.RAND.nextInt(9)]}, ProductsData.MANUFACTURERS[ProductsData.RAND.nextInt(4)], ProductsData.GENDERS[ProductsData.RAND.nextInt(2)], ProductsData.RAND.nextInt(20) + 30));
  }
  public void produceSwimGoggles() {
    this.swimSet.addItem(new SwimGoggles(ProductsData.SWIMGOGGLES_NAMES[ProductsData.RAND.nextInt(2)], (ProductsData.RAND.nextInt(1000) + 1) * 10, new String[]{ProductsData.COLORS[ProductsData.RAND.nextInt(9)]}, ProductsData.MANUFACTURERS[ProductsData.RAND.nextInt(4)], ProductsData.GENDERS[ProductsData.RAND.nextInt(2)], ProductsData.GOGGLES_TYPES[ProductsData.RAND.nextInt(1)]));
  }
  public void produceSwimCap() {
    this.swimSet.addItem(new SwimCap(ProductsData.SWIMCAP_NAMES[ProductsData.RAND.nextInt(2)], (ProductsData.RAND.nextInt(1000) + 1) * 10, new String[]{ProductsData.COLORS[ProductsData.RAND.nextInt(9)]}, ProductsData.MANUFACTURERS[ProductsData.RAND.nextInt(4)], ProductsData.GENDERS[ProductsData.RAND.nextInt(2)], ProductsData.CAP_MATERIALS[ProductsData.RAND.nextInt(1)]));
  }
  public void producePullFloat() {
    this.swimSet.addItem(new PullFloat(ProductsData.PULLFLOAT_NAMES[ProductsData.RAND.nextInt(2)], (ProductsData.RAND.nextInt(1000) + 1) * 10, new String[]{ProductsData.COLORS[ProductsData.RAND.nextInt(9)]}, ProductsData.MANUFACTURERS[ProductsData.RAND.nextInt(4)], "Тренировка рук", ProductsData.FORMS[ProductsData.RAND.nextInt(1)]));
  }
  public void producePaddles() {
    boolean paddlesSmall = ProductsData.RAND.nextBoolean();
    if (paddlesSmall) {
      SmallFactory sf = new SmallFactory();
      Paddles product = sf.producePaddles(ProductsData.PADDLES_NAMES[ProductsData.RAND.nextInt(2)], (ProductsData.RAND.nextInt(1000) + 1) * 10, new String[]{ProductsData.COLORS[ProductsData.RAND.nextInt(9)]}, ProductsData.MANUFACTURERS[ProductsData.RAND.nextInt(4)], "Тренировка рук", "Плоские");
      this.swimSet.addItem(new HandsDecorator2((Paddles) product));
    } else {
      BigFactory bf = new BigFactory();
      Paddles product = bf.producePaddles(ProductsData.PADDLES_NAMES[ProductsData.RAND.nextInt(2)], (ProductsData.RAND.nextInt(1000) + 1) * 10, new String[]{ProductsData.COLORS[ProductsData.RAND.nextInt(9)]}, ProductsData.MANUFACTURERS[ProductsData.RAND.nextInt(4)], "Тренировка рук", "Под форму руки");
      this.swimSet.addItem(new HandsDecorator3((Paddles) product));
    }
  }
  public void produceKickboard() {
    this.swimSet.addItem(new Kickboard(ProductsData.KICKBOARD_NAMES[ProductsData.RAND.nextInt(2)], (ProductsData.RAND.nextInt(1000) + 1) * 10, new String[]{ProductsData.COLORS[ProductsData.RAND.nextInt(9)]}, ProductsData.MANUFACTURERS[ProductsData.RAND.nextInt(4)], "Тренировка ног", ProductsData.FORMS[ProductsData.RAND.nextInt(1)]));
  }
  public void produceFins() {
    boolean finsSmall = ProductsData.RAND.nextBoolean();
    if (finsSmall) {
      SmallFactory sf = new SmallFactory();
      Fins product = sf.produceFins(ProductsData.FINS_NAMES[ProductsData.RAND.nextInt(2)], (ProductsData.RAND.nextInt(1000) + 1) * 10, new String[]{ProductsData.COLORS[ProductsData.RAND.nextInt(9)]}, ProductsData.MANUFACTURERS[ProductsData.RAND.nextInt(4)], "Тренировка ног", ProductsData.SIZES[ProductsData.RAND.nextInt(4)]);
      this.swimSet.addItem(new LegsDecorator2((Fins) product));
    } else {
      BigFactory bf = new BigFactory();
      Fins product = bf.produceFins(ProductsData.FINS_NAMES[ProductsData.RAND.nextInt(2)], (ProductsData.RAND.nextInt(1000) + 1) * 10, new String[]{ProductsData.COLORS[ProductsData.RAND.nextInt(9)]}, ProductsData.MANUFACTURERS[ProductsData.RAND.nextInt(4)], "Тренировка ног", ProductsData.SIZES[ProductsData.RAND.nextInt(4)]);
      this.swimSet.addItem(new LegsDecorator3((Fins) product));
    }
  }
}
