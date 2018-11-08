package spil;

/**
 * This class is controlling each field.
 *
 * <p>
 *     Each field has a name, a value and a description. While one field can give the player another turn.
 * </p>
 *
 */
public class Field {
    /**
     * Defines the name of the field.
     */
    public final String name;
    /**
     * Defines the value of the field. The Value of the field, is how much money the player is getting or how much money the player is losing.
     */
    public final int value;
    /**
     * Defines if the player is getting another turn.
     */
    public final boolean getsAnotherTurn;
    /**
     * Defines the fields description.
     */
    public final String fieldText;

    /**
     * This method is for creating fields, where the player can't get another turn.
     * @param name The name of the field.
     * @param value The value of the field.
     * @param fieldText The description of the field.
     */
    public Field(String name, int value, String fieldText) {
        this.name = name;
        this.value = value;
        this.fieldText = fieldText;
        getsAnotherTurn = false;
    }

    /**
     * This method is for creating the field, where the player can get another turn.
     * @param name The name of the field.
     * @param value The value of the field.
     * @param fieldText The description of the field.
     * @param getsAnotherTurn The variable that decides if the player is getting another turn.
     */
    public Field(String name, int value, String fieldText, boolean getsAnotherTurn) {
        this.name = name;
        this.value = value;
        this.fieldText = fieldText;
        this.getsAnotherTurn = getsAnotherTurn;
    }
}

