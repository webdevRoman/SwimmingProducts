public class Main {
  public static void main(String[] args) {
//    https://arenarussia.ru/gds.php?id=1490521
    SwimmingProduct swimsuit = new Swimsuit("Carbon Ultra Jammer", 24150, "Серый", "Arena", "Мужской", 60);
//    https://arenarussia.ru/gds.php?id=1461013
    SwimmingProduct swimGoggles = new SwimGoggles("Cobra Mirror", 3626, "Белый, Зеленый, Серый", "Arena", "Унисекс", "Стартовые");
//    https://tyr.ru/catalog/shapochki_sorevnovatelnye/product/shapochka_dlya_plavaniya_tyr_tracer_x_dome_cap_1/
    SwimmingProduct swimCap = new SwimCap("Tracer-X Dome Cap", 2590, "Белый", "TYR", "Унисекс", "Силикон");
//    https://tyr.ru/catalog/kolobashki/product/kolobashka_tyr_pull_float/
    SwimmingProduct pullFloat = new PullFloat("Pull Float", 1390, "Белый, Синий", "TYR", "Тренировка рук", "Классическая");
//    https://arenarussia.ru/gds.php?id=1363587
    SwimmingProduct paddles = new Paddles("Elite Finger Paddle", 1260, "Черный, Серебристый", "Arena", "Тренировка рук", true);
//    https://arenarussia.ru/gds.php?id=1275290
    SwimmingProduct kickboard = new Kickboard("Kickboard", 1667, "Красный", "Arena", "Тренировка ног", "Классическая");
//    https://tyr.ru/catalog/lasty/product/lasty_tyr_flexfins/
    SwimmingProduct fins = new Fins("Flexfins", 2990, "Разноцветный", "TYR", "Тренировка ног", "M", false);


    swimsuit.showInfo();
    swimGoggles.showInfo();
    swimCap.showInfo();
    pullFloat.showInfo();
    paddles.showInfo();
    kickboard.showInfo();
    fins.showInfo();
  }
}