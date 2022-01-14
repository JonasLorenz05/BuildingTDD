public class Building {
    private static int id;
    private static String resident;

    public Building(int id, String resident) {
        this.id = id;
        this.resident = resident;
    }

    public static String getResident() {
        return resident;
    }
}
