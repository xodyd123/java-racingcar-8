package racingcar.domain.converter;

import racingcar.domain.dto.reponse.ResponseAttemptCountDto;
import racingcar.domain.dto.request.AttemptCountDto;
import racingcar.domain.dto.request.UserDto;
import racingcar.domain.dto.reponse.ResponseUserDto;

public class IntConverter implements Converter {

    @Override
    public ResponseAttemptCountDto convert(UserDto userDto) {
        int converterNumber = 0 ;
        if (userDto instanceof AttemptCountDto) {
            String attemptCount = ((AttemptCountDto) userDto).getAttemptCount();
            System.out.println("attemptCount = " + attemptCount);
            converterNumber = Integer.parseInt(attemptCount);
        }
        return new ResponseAttemptCountDto(converterNumber);
    }
}
