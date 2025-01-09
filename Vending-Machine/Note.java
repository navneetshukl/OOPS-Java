// The Coin and Note enums represent the different denominations of coins and notes accepted by the vending machine.

public enum Note{
    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20);

    private final int value;

    Note(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}