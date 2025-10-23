package racingcar.domain;

import java.util.List;


public class RacingGame {

    private List<Car> cars;

    public RacingGame(List<String> carName) {
        this.cars = carName.stream().map(String::trim).map(Car::new).toList();

    }

    public List<Car> play(){
        racing();
        return cars;
    }

    private void racing(){
        cars.stream().forEach(car -> {car.racing();});
    }

    public List<String> winnerResult(int maxNumber) {
        for(int i = maxNumber; i > 0; i--) {
            int finalI = i;
            List<String> list = cars.stream()
                    .filter(car -> car.getPosition() == finalI)
                    .map(car -> car.getName()).toList();
            if(list.size() > 0){
                return list;
            }
        }
        return null ;
    }


}
