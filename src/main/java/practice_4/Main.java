package practice_4;

import practice_4.solvers.IfElseTaskSolver;
import practice_4.solvers.SwitchTaskSolver;

public class Main {
    public static void main(String[] args) {
        IfElseTaskSolver ts1 = new IfElseTaskSolver();

//        even or odd
//        System.out.println(ts1.checkEvenOdd(4));

//        age check method
//        System.out.println(ts1.checkAge(16));
//        System.out.println(ts1.checkAge(55));
//        System.out.println(ts1.checkAge(88));

//        find max number
//        System.out.println(ts1.findMax(1, -99, 333));

        SwitchTaskSolver switchTaskSolver = new SwitchTaskSolver();

//        System.out.println(switchTaskSolver.dayOfWeek(3));
//        System.out.println(switchTaskSolver.dayOfWeek(33));
        System.out.println(switchTaskSolver.describeSeason(Season.WINTER));
        System.out.println(switchTaskSolver.describeSeason(Season.AUTUMN));

    }
}
