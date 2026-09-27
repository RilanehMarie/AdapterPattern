class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger charger;

    SmartphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }

    public void plugIn() {
        charger.chargePhone();
    }
}