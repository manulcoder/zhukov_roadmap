package world;

import entity.Entity;
import entity.animal.Herbivore;
import entity.animal.Predator;
import entity.objects.Grass;
import entity.objects.Rock;
import entity.objects.Tree;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class WorldPopulate {
    private static List<Cell> list;
    private static int size;

    static void setEntityRandom(List<Cell> l) {
        list = l;
        size = list.size();

        setEntity(Herbivore.class);
        setEntity(Predator.class);
        setEntity(Grass.class);
        setEntity(Tree.class);
        setEntity(Rock.class);
    }

    private static <T extends Entity> void setEntity(Class<T> type) {
        try {
            for (int i = 0; i < 3; ) {
                int index = getRandomValueBySize(size);
                if (list.get(index).isCellFree()) {
                    list.get(index).setEntity(type.getDeclaredConstructor().newInstance());
                } else {
                    continue;
                }
                i++;
            }
        } catch (InstantiationException
                 | IllegalAccessException
                 | InvocationTargetException
                 | NoSuchMethodException e) {
            System.out.println(e);
        }
    }

    private static int getRandomValueBySize(int size) {
        return (int) Math.floor(Math.random() * size);
    }
}
