package game;

/**
 * This class is creating the different fields.
 *
 * <p>
 *     Field Factory is creating the fields when a player has rolled the dices, and then returns the values to the Field class.
 * </p>
 *
 * Field Factory  ... lave felterne ... og give værdier... videre til Field.
 *
 */
public class FieldFactory {

    GameStringContainer stringContainer;
    public FieldFactory(GameStringContainer stringContainer) {
        this.stringContainer = stringContainer;
    }

    /**
     * This method is creating a new field each time a player rolls the dices.
     * @param Sum Is used for which field needs to generated.
     * @return Is returning the specified field number.
     */
    public Field getField(int Sum) {
        switch (Sum) {
            case 2:
                return new Field("Tower", 250, stringContainer.getString("field_tower"));
            case 3:
                return new Field("Crater", -100, stringContainer.getString("field_crater"));
            case 4:
                return new Field("Palace gates", 100, stringContainer.getString("field_palace_gates"));
            case 5:
                return new Field("Cold Desert", -20, stringContainer.getString("field_cold_desert"));
            case 6:
                return new Field("Walled City", 180, stringContainer.getString("field_walled_city"));
            case 7:
                return new Field("Monastary", 0, stringContainer.getString("field_monastary"));
            case 8:
                return new Field("Black Cave", -70, stringContainer.getString("field_black_cave"));
            case 9:
                return new Field("Huts in the mountain", 60, stringContainer.getString("field_huts_in_the_mountain"));
            case 10:
                return new Field("The Werewall", -80, stringContainer.getString("field_the_werewall"), true);
            case 11:
                return new Field("The Pit", -50, stringContainer.getString("field_the_pit"));
            case 12:
                return new Field("Goldmine", 650, stringContainer.getString("field_goldmine"));

        }
        throw new IllegalArgumentException("Programfejl: Umuligt antal øjne");
    }
}
