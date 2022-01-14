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

    @Test
    void IfYouTryToAddTheResidentWhichIsInTheBuildingNothingShouldHappen() {
        Building building = new Building(81, "Lorenz");
        building.addResident("Lorenz");

        Assertions.assertEquals(1, Building.getResidents().size());

    }

    @Test
    void IfYouTryToAddTwoResidentsWhichAreInTheBuildingNothingShouldHappen() {
        String[] residents = {"Lorenz", "Huber"};
        Building building = new Building(81, residents);
        building.addResidents(residents);

        Assertions.assertEquals(2, Building.getResidents().size());

    }

    @Test
    void IfYouRemoveAResidentItShouldNotBeHereAnymore() {
        String[] residents = {"Lorenz", "Huber"};
        Building building = new Building(81, residents);
        building.removeResident("Huber");

        Assertions.assertEquals(1, Building.getResidents().size());
        Assertions.assertEquals("Lorenz", Building.getResidents().toArray()[0]);

    }

    @Test
    void IfYouRemoveThreeResidentsOfThreeNoOneShouldBeHereAnymore() {
        String[] residents = {"Lorenz", "Huber", "Muster"};

        Building building = new Building(81, residents);
        building.removeResidents(residents);

        Assertions.assertEquals(0, Building.getResidents().size());
    }

    @Test
    void IfYouRemoveAResidentWhichIsNotHereItShouldHappenNothing() {
        Building building = new Building(81, "Lorenz");
        building.removeResident("Muster");

        Assertions.assertEquals(1, Building.getResidents().size());
        Assertions.assertEquals("Lorenz", Building.getResidents().toArray()[0]);

    }

    @Test
    void IfYouRemoveTwoResidentsWhichAreNotHereItShouldHappenNothing() {
        String[] residents = {"Lorenz", "Huber", "Muster"};
        String[] rem = {"Lor", "Hub", "Mus"};
        Building building = new Building(81, residents);
        building.removeResidents(rem);

        Assertions.assertEquals(3, Building.getResidents().size());
        Assertions.assertEquals("Lorenz", Building.getResidents().toArray()[0]);
        Assertions.assertEquals("Huber", Building.getResidents().toArray()[1]);
        Assertions.assertEquals("Muster", Building.getResidents().toArray()[2]);
    }

}
