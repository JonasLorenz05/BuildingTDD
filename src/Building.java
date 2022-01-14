public class Building {
    private static int id;
    private static String resident;
    private static String[] residents;

    public Building(int id, String resident) {
        this.id = id;
        this.resident = resident;
    }

    public Building(int id, String[] residents) {
        this.residents = residents;
        this.id = id;
    }

    public static String getResident() {
        return resident;
    }

    public static String[] getResidents() {
        return residents;
    }
}
