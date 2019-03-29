package Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Composite director = new Composite("Director", "Liskina A.A.");

        Composite headTeacher1 = new Composite("Head teacher", "Ivanova I.M.");
        Composite headTeacher2 = new Composite("Head teacher", "Holovko I.I.");
        Composite headTeacher3 = new Composite("Head teacher", "Holka V.V.");

        director.add(headTeacher1);
        director.add(headTeacher2);
        director.add(headTeacher3);

        Composite classTeacher1 = new Composite("Class teacher", "Lolochka M.M.");
        Composite classTeacher2 = new Composite("Class teacher", "Cat K.L.");
        Composite classTeacher3 = new Composite("Class teacher", "Ryba S.S.");
        Composite classTeacher4 = new Composite("Class teacher", "Hadyniak R.A.");

        headTeacher1.add(classTeacher1);
        headTeacher2.add(classTeacher2);
        headTeacher3.add(classTeacher3);
        headTeacher3.add(classTeacher4);

        List<Leaf> parents = new ArrayList<Leaf>();
        for (int i = 0; i < 9; i++) {

            Random rand = new Random();
            parents.add(new Leaf("Parent # " + (i + 1), rand.nextInt(901) + 100));
        }

        classTeacher1.add(parents.get(0));
        classTeacher1.add(parents.get(1));
        classTeacher1.add(parents.get(2));

        classTeacher2.add(parents.get(3));
        classTeacher2.add(parents.get(4));
        classTeacher2.add(parents.get(5));

        classTeacher3.add(parents.get(6));
        classTeacher3.add(parents.get(7));
        classTeacher3.add(parents.get(8));


        System.out.println("All money : " + director.getMoney());


    }
}
