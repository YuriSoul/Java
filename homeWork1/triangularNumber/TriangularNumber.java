package developer.secondQuarter.homeWork1.triangularNumber;

public class TriangularNumber {
    int nth = 1;

    public int calcTriangNum(int num) {

            nth = (num * (num + 1)) / 2;
            return nth;
    }
}
