package racingcar.domain.racing;

public  class ThresholdMoveRule implements MoveRule {
    private static int MIN_RANDOM_TO_MOVE = 4;


    @Override
    public boolean MoveRule(int number) {
        if (number >= MIN_RANDOM_TO_MOVE) {
            return true ;
        }
        return false;
    }
}
