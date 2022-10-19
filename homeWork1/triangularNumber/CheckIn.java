package developer.secondQuarter.homeWork1.triangularNumber;

public class CheckIn {

    public boolean isBiggerThan(String s) throws NumberFormatException {
        try {
            if(Integer.parseInt(s) > 0) {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }
}
