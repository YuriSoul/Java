package Seminars.homeWork2.hanoiTower;
// Задача о Ханойской башне

public class HanoiTower {
    public void move(int disks, int source, int auxiliary, int target)
    {
        if (disks > 0)
        {
            // перемещаем `n-1` дисков из исходного во вспомогательный, используя цель
            // как промежуточный полюс
            move(disks - 1, source, target, auxiliary);
 
            // перемещаем один диск из источника в цель
            System.out.println("Move disk " + disks + " from " + source + " —> " +
                                target);
 
            // перемещаем `n-1` дисков из вспомогательного в целевой, используя исходный
            // как промежуточный полюс
            move(disks - 1, auxiliary, source, target);
        }
    }
}