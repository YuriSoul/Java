package Seminars.homeWork2.hanoiTower;

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


// Задача о Ханойской башне


// Скачать  Выполнить код

// Output:
 
// Move disk 1 from 1 —> 3
// Move disk 2 from 1 —> 2
// Move disk 1 from 3 —> 2
// Move disk 3 from 1 —> 3
// Move disk 1 from 2 —> 1
// Move disk 2 from 2 —> 3
// Move disk 1 from 1 —> 3
    
// }
