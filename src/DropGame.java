// ap 2006 - 4 task

public class DropGame {
    private Enviroment theEnv;

    public Location dropLocationForColumn(int column) {

        for (Location location : theEnv.getLocations(column)) {
            if (location.isEmptyLocation()) return location;
        }

        return null;
    }

    public boolean dropMatchesNeighbors(int column, Color pieceColor) {
        return false;
    }
}
