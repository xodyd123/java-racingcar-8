package racingcar.domain.converter;

import racingcar.domain.dto.reponse.ResponseCarNameDto;
import racingcar.domain.dto.request.CarNameDto;
import racingcar.domain.dto.request.UserDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayConverter implements Converter {


    @Override
    public ResponseCarNameDto convert(UserDto userDto) {
        List<String> carNames = new ArrayList<>();
        if(userDto instanceof CarNameDto) {
            CarNameDto carNameDto = (CarNameDto) userDto;
            String carName = carNameDto.getCarName();
            carNames = new ArrayList<>(Arrays.asList(carName.split(",")));
        }
        return new ResponseCarNameDto(carNames);
    }
}
