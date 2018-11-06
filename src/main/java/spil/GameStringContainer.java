package spil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class GameStringContainer {
    Dictionary<String, String> gameStrings;

    GameStringContainer(String filePath) throws FileNotFoundException {
        parseFile(filePath);
    }

    public String getString(String key) {
        return gameStrings.get(key);
    }

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
