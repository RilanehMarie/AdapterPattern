class LaptopAdapter implements PowerOutlet {
    private Laptop laptop;

    LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    public void plugIn() {
        laptop.charge();
    }
}