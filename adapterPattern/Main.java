public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        laptopAdapter.plugIn();

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        refrigeratorAdapter.plugIn();

        SmartphoneCharger charger = new SmartphoneCharger();
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(charger);
        smartphoneAdapter.plugIn();
    }
}