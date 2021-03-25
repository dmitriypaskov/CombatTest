package pashkov;

import java.util.*;

public class ThingsFactory extends Thing {

    private final List<Thing> things = new ArrayList<>();
    private final Random RANDOM = new Random();

    public List<Thing> addThings() {
        Thing thing1 = new Thing(RANDOM.nextInt(7) + 1, RANDOM.nextInt(25) + 1);
        things.add(thing1);
        Thing thing2 = new Thing(RANDOM.nextInt(7) + 1, RANDOM.nextInt(25) + 1);
        things.add(thing2);
        Thing thing3 = new Thing(RANDOM.nextInt(7) + 1, RANDOM.nextInt(25) + 1);
        things.add(thing3);
        Thing thing4 = new Thing(RANDOM.nextInt(7) + 1, RANDOM.nextInt(25) + 1);
        things.add(thing4);
        Thing thing5 = new Thing(RANDOM.nextInt(7) + 1, RANDOM.nextInt(25) + 1);
        things.add(thing5);
        Collections.sort(things, new Comparator<Thing>() {
            @Override
            public int compare(Thing o1, Thing o2) {
                return Double.compare(o1.getPrisePerKilogram(), o2.getPrisePerKilogram());
            }
        });
        return things;
    }

    public List<Thing> getThings() {
        return things;
    }
}
