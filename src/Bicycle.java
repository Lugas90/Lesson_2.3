public class Bicycle extends Transport implements ServiceStationCheck {


    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }

    public void check() {
        if (this != null) {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
        }
    }
}
