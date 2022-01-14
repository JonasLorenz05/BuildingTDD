import java.util.LinkedList;
import java.util.List;

public class Building {
    private static int id;
    private static List<String> residents = new LinkedList<>();

    public Building(int id, String resident) {
        this.id = id;
        residents.add(resident);
    }

    public Building(int id, String[] inputResidents) {
        this.id = id;
        residents.addAll(List.of(inputResidents));
    }

    public static List<String> getResidents() {
        return residents;
    }

    public void addResident(String name) {
        if (!residents.contains(name)){
            residents.add(name);
        }
    }

    public void addResidents(String[] names) {
        for (var v : names){
            if (!residents.contains(v)){
                residents.add(v);
            }
        }
    }
}
