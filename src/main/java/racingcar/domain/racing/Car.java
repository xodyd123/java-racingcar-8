package racingcar.domain.racing;

public class Car {
    private final String name ;
    private int position ;

    public Car(String name) {
        this.name = name;
    }

    public void racing(NumberProvider numberProvider , MoveRule moveRule) {
        int baseLine = numberProvider.generateNumbers();
        if(moveRule.MoveRule(baseLine)) {
            move() ;
        }
        stop();
    }

    public void move() {
        position ++ ;
        return ;
    }

    public void stop(){
        return ;
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
