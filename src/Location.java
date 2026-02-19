public class Location {
    private int _column;
    private int _row;

    public int[] getLocation() {
        int[] location = new int[2];
        location[0] = _row;
        location[1] = _column;
        return location;
    }

    public boolean isEmptyLocation() {
        return false;
    }
}
