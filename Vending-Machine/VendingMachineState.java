// The VendingMachineState interface defines the behavior of the vending machine in different states, such as idle, ready, and dispense.

public interface VendingMachineState {
    void selectProduct(Product product);
    void insertCoin(Coin coin);
    void insertNote(Note note);
    void dispenseProduct();
    void returnChange();
}