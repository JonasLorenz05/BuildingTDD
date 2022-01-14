import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuildingUT {
    @Test
    void ItShouldBeOneResidentInBuilding_GivingOneResident() {
        Building building = new Building(81, "Lorenz");
        Assertions.assertEquals("Lorenz", Building.getResident());
    }
    @Test
    void ItShouldBeTwoResidentsInBuilding_GivingTwoResidents() {
        String[] residents = {"Lorenz", "Huber"};
        Building building = new Building(81, residents);

        Assertions.assertEquals(residents, Building.getResidents());
    }
}
