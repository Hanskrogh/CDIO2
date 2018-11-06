package spil;

import sun.font.TrueTypeFont;

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
    /**
     * This method is creating a new field each time a player rolls the dices.
     * @param Sum Is used for which field needs to generated.
     * @return Is returning the specified field number.
     */
    public static Field getField(int Sum) {
        switch (Sum) {
            case 2:
                return new Field("Tower", 250, "Du har fundet tårne, og finder gamle skatte. Du får 250 !");
            case 3:
                return new Field("Crater", -100, "Du faldt ned i et krater og mistede 100");
            case 4:
                return new Field("Palace gates", 100, "Du kom til et palads! 100 til dig!");
            case 5:
                return new Field("Cold Desert", -20, "Du landede i en kold ørken. Øv! -20");
            case 6:
                return new Field("Walled City", 180, "Du fandt walled city! Du får 180");
            case 7:
                return new Field("Monastary", 0, "Du kom til monastery og fik ingenting");
            case 8:
                return new Field("Black Cave", -70, "Du befinder dig nu i en sort grotte, -70");
            case 9:
                return new Field("Huts in the mountain", 60, "Du fandt nogle små hytter på et bjerg! Og får 60!");
            case 10:
                return new Field("The Werewall", -80, "Øv! Du kom til varulve grotten og mistede 80! Men du får en ekstra tur!", true);
            case 11:
                return new Field("The Pit", -50, "Du landede på the pit og mistede 50");
            case 12:
                return new Field("Goldmine", 650, "Du har fundet guld i bjergene og sælger det for 650, du er rig!");

        }
        throw new IllegalArgumentException("Programfejl: Umuligt antal øjne");
    }
}
