package racingcar.domain.dto.request;

public class CarNameDto extends UserDto{

    private String carName;

    public CarNameDto(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
}
