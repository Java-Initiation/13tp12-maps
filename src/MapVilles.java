import java.util.HashMap;
import java.util.Map;

public class MapVilles {

    public static void main(String[] args) {

        HashMap<String, Ville> myMap = new HashMap<>();
        myMap.put("Nice", new Ville("Nice", 343_000));
        myMap.put("Carcassonne", new Ville("Carcassonne", 478_000));
        myMap.put("Narbonne", new Ville("Narbonne", 534_000));
        myMap.put("Lyon", new Ville("Lyon", 484_000));
        myMap.put("Foix", new Ville("Foix", 9_700));
        myMap.put("Pau", new Ville("Pau", 77_200));
        myMap.put("Marseille", new Ville("Marseille", 850_700));
        myMap.put("Tarbes", new Ville("Tarbes", 40_600));

        Map.Entry<String, Ville> villeMoinsPeuplee = null;
        for (Map.Entry<String, Ville> villeEntry : myMap.entrySet()) {
            if (villeMoinsPeuplee != null){
                if (villeMoinsPeuplee.getValue().getNbHabitants() > villeEntry.getValue().getNbHabitants())
                    villeMoinsPeuplee = villeEntry;
            }
            else
                villeMoinsPeuplee = villeEntry;
        }

        myMap.remove(villeMoinsPeuplee.getKey());

        for (Ville value : myMap.values()) {
            System.out.println(value);
        }

    }

}
