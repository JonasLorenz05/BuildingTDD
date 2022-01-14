import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuildingUT {
    @Test
    void ItShouldBeOneResidentInBuilding_GivingOneResident() {
        Building building = new Building(81, "Lorenz");
        Assertions.assertEquals("Lorenz", Building.getResidents().get(0));
    }
    @Test
    void ItShouldBeTwoResidentsInBuilding_GivingTwoResidents() {
        String[] residents = {"Lorenz", "Huber"};
        Building building = new Building(81, residents);

        Assertions.assertEquals("Huber", Building.getResidents().toArray()[1]);
    }

    @Test
    void ItShouldBePossibleToAddAResident() {
        Building building = new Building(81, "Lorenz");
        building.addResident("Huber");

        Assertions.assertEquals("Huber", Building.getResidents().toArray()[1]);

    }

    @Test
    void ItShouldBePossibleToAddTwoResidents() {
        Building building = new Building(81, "Lorenz");
        String[] namedToBeAdded = {"Lorenz", "Huber"};

        building.addResidents(namedToBeAdded);

        Assertions.assertEquals(3, Building.getResidents().size());

    }


}
