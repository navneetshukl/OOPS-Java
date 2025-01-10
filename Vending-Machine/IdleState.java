class IdleState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override

    public void selectProduct(Product product){
        if(vendingMachine.inventory.isAvailable(product)){
            
        }
    }
}