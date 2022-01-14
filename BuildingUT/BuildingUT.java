import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuildingUT {
    @Test
    void ItShouldBeOneResidentInBuilding_GivingOneResident() {
        Building building = new Building(81, "Lorenz");
        Assertions.assertEquals("Lorenz", Building.getResident());
    }
}
