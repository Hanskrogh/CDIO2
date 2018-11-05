package spil;

/**
 *
 * @since 1.0.1
 */
public class Field {
    public final String name;
    public final int value;
    public final boolean getsAnotherTurn;
    public final String fieldText;

    Field(String name, int value, String fieldText) {
        this.name = name;
        this.value = value;
        this.fieldText = fieldText;
        getsAnotherTurn = false;
    }

    Field(String name, int value, String fieldText, boolean getsAnotherTurn) {
        this.name = name;
        this.value = value;
        this.fieldText = fieldText;
        this.getsAnotherTurn = getsAnotherTurn;
    }
}

