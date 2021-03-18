import com.sun.codemodel.internal.JForEach;
import sun.tools.jconsole.inspector.XObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Robot robot1 = new Robot(11,11);
        Human human1 = new Human(11,11);
        Cat cat1 = new Cat(11,11);

        Wall wall1 = new Wall(8);
        Track track1 = new Track(8);

        Object[] competitors = new Object[5];
        competitors[0] = robot1;
        competitors[1] = human1;
        competitors[2] = cat1;

        Object[] barriers = new Object[2];
        barriers[0] = wall1;
        barriers[1] = track1;

        for(Object Competitors : competitors) {
            for(Object Barriers : barriers) {


            }
        }

//        for(int i=0; i<competitors.length; i++) {
//            for (int j = 0; j < barriers.length; j++) {
//
//
//
//            }
//        }


        // + создать массив из robot1, human1 и cat1
        // + создать массив из wall1 и track1
        // класс, реализующий интерфейс Action, принимает препятствие (Wall вызывает метод jump)
        // проверка, может ли участник преодолеть препятствие
        //

/*      Robot robot1 = new Robot();
        Robot robot2 = new Robot();
        Robot robot3 = new Robot();
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        ArrayList<Track> runners = new ArrayList<>();
        runners.add(robot1);
        runners.add(robot2);
        runners.add(human1);
        runners.add(human2);
        runners.add(cat1);
        runners.add(cat2);

        ArrayList<Wall> jumpers = new ArrayList<>();
        jumpers.add(robot2);
        jumpers.add(robot3);
        jumpers.add(human2);
        jumpers.add(human3);
        jumpers.add(cat2);
        jumpers.add(cat3);

        for (Track allRunners : runners){
            allRunners.run();

        }

        for (Wall allJumpers : jumpers){
            allJumpers.jump();
        }

        */

    }
}
