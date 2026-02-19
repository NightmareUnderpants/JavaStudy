import java.util.*;

public class Enviroment {
    private List<List<Location>> _locations = new ArrayList<>();

    public Location[] getLocations(int column) {
        List<Location> locations = _locations.get(column);

        return locations.toArray(new Location[locations.size()]);
    }
}
