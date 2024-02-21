package POO;

import java.util.HashMap;
import java.util.Map;

public class OpcioneRM {
    
        Map<String, String[]> opcioensMap = new HashMap<>();
    public OpcioneRM(){
        opcioensMap.put("pelo", new String[]{"WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"});
        opcioensMap.put("ojos", new String[]{"|  O O  |", "|-(· ·)-|", "|-(o o)-|", "|  \\/  |"});
        opcioensMap.put("narizorejas", new String[]{"@   J   @", "{   \"}", "[   j   ]", "<   ->"});
        opcioensMap.put("boca", new String[]{"|  ===  |", "|   -|", "|  ___  |", "|---|"});

    }

    public Map<String, String[]> getOpciones(){
        return opcioensMap;
    }
}
