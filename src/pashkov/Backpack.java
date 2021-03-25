package pashkov;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private final int carrying;
    private final ThingsFactory thingsFactory = new ThingsFactory();
    private final List<Thing> backpackContents = new ArrayList<>();

    public void fillTheBackpack() {
        thingsFactory.addThings();
        int freeVolume = getCarrying();
        for (int i = 0; i < thingsFactory.getThings().size(); ) {
            if (freeVolume >= thingsFactory.getThings().get(thingsFactory.getThings().size() - 1 - i).getWeight()) {
                if (freeVolume > 0) {
                    freeVolume = freeVolume - thingsFactory.getThings().get(thingsFactory.getThings().size() - 1 - i).getWeight();
                    backpackContents.add(thingsFactory.getThings().get(thingsFactory.getThings().size() - 1 - i));
                    System.out.println(backpackContents.get(i).getWeight());
                }
            } else {
                i++;
            }
        }
    }

    public void printInfoAboutContentsBackpack() {
        int freeVolume = getCarrying();
        int sum = 0;
        for (Thing backpackContent : backpackContents) {
            freeVolume -= backpackContent.getWeight();
            sum += backpackContent.getWeight() * backpackContent.getPrisePerKilogram();
        }
        System.out.println("Remaining free space in the backpack FreePlace = " + freeVolume);
        System.out.println("Number of items in the backpack : N = " + backpackContents.size());
        System.out.println("The price of all things in the backpack : Sum = " + sum);
    }

    public Backpack(int carrying) {
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }
}
