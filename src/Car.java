public class Car extends Transport implements ServiceStationCheck {


    public void updateTyre() {
        System.out.println("Меняем покрышку легковушки");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель легковушки");
    }

    public void check() {
        if (this != null) {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
        }
    }
}
