package Seminars.homeWork2.hanoiTower;

public class Main {
    public static void main(String[] args) {
        HanoiTower ht = new HanoiTower();
        int n = 4;
        ht.move(n, 1, 2, 3);
    }
}
