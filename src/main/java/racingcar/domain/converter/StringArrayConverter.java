package racingcar.domain.converter;

import racingcar.domain.dto.reponse.ResponseCarNameDto;
import racingcar.domain.dto.request.CarNameDto;
import racingcar.domain.dto.request.UserDto;

public class StringArrayConverter implements Converter {


    @Override
    public ResponseCarNameDto convert(UserDto userDto) {
        String[] carNames = null ;
        if(userDto instanceof CarNameDto) {
            CarNameDto carNameDto = (CarNameDto) userDto;
            String carName = carNameDto.getCarName();
            carNames = carName.split(",");
        }
        return new ResponseCarNameDto(carNames);
    }
}
