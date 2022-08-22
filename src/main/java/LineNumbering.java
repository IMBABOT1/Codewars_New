import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LineNumbering {

    public static List<String> number(List<String> lines) {
        int counter = 1;

        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, counter + ":" + " " + lines.get(i));
            counter++;
        }

        return lines;
    }
}
