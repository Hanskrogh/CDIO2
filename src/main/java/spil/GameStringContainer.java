package spil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * This class is used for defining which language to play the game in.
 *
 * <p>
 *     The application can be used in 2 languages:
 *      - English
 *      - Danish
 * </p>
 *
 */
public class GameStringContainer {
    Dictionary<String, String> gameStrings;

    /**
     * This constructor is used for calling the method parseFile
     *
     * <p>
     *
     * </p>
     *
     * @param filePath Is the path of where the file is located.
     * @throws FileNotFoundException Is for if the program can't find the file.
     */
    public GameStringContainer(String filePath) throws FileNotFoundException {
        parseFile(filePath);
    }

    /**
     *
     * @param key Is used for...
     * @return Returning ...
     */
    public String getString(String key) {
        return gameStrings.get(key);
    }

    /**
     *
     * @param path Is the path of where the file is located.
     * @throws FileNotFoundException Is for if the program can't find the file.
     */
    private void parseFile(String path) throws FileNotFoundException {
        gameStrings = new Hashtable<String, String>();

        FileInputStream fileInputStream = new FileInputStream(path);
        Scanner s = new Scanner(fileInputStream);

        int lineCount = 0;
        String key = "";
        while (s.hasNext()) {
            if (lineCount % 2 == 0) { key = s.nextLine(); }
            else {
                gameStrings.put(key, s.nextLine());
            }
            lineCount++;
        }

        s.close();
    }
}
