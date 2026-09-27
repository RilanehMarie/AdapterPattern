class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator refrigerator;

    RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public void plugIn() {
        refrigerator.startCooling();
    }
}