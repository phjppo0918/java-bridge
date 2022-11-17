package bridge;

public enum BridgeShape {
    STARTING_POINT("[ "),
    DIVISION(" | "),
    ENDING_POINT(" ]"),
    ALLOW_MOVE("O"),
    REFUSE_MOVE("X");

    private final String value;

    BridgeShape(String value) {
        this.value = value;
    }
}
