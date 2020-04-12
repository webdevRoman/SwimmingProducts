package Builder;

public class BuildDirector {
  private SwimSetBuilder builder;
  public void setBuilder(SwimSetBuilder builder) { this.builder = builder; }

  public void produceBasicSwimSet() {
    this.builder.produceSwimsuit();
    this.builder.produceSwimCap();
    this.builder.produceSwimGoggles();
  }
  public void produceAdvancedSwimSet() {
    this.builder.produceSwimsuit();
    this.builder.produceSwimCap();
    this.builder.produceSwimGoggles();
    this.builder.produceKickboard();
    this.builder.producePullFloat();
  }
  public void produceFullSwimSet() {
    this.builder.produceSwimsuit();
    this.builder.produceSwimCap();
    this.builder.produceSwimGoggles();
    this.builder.produceKickboard();
    this.builder.producePullFloat();
    this.builder.produceFins();
    this.builder.producePaddles();
  }
}
