package racingcar.domain.converter;

import racingcar.domain.dto.request.UserDto;
import racingcar.domain.dto.reponse.ResponseUserDto;

public interface Converter {

    public ResponseUserDto convert(UserDto userDto);
}
