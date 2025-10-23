package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int MIN_RANDOM_TO_MOVE = 3;
    private final String name ;
    private int position ;

    public Car(String name) {
        this.name = name;
    }

    public void racing(){
        int baseLine = Randoms.pickNumberInRange(0, 9);
        if(baseLine > MIN_RANDOM_TO_MOVE){
            position ++ ;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(position);
    }
}
