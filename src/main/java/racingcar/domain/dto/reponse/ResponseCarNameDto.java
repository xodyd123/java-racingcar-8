package racingcar.domain.dto.reponse;

import java.util.List;

public class ResponseCarNameDto extends ResponseUserDto {

    public ResponseCarNameDto(List<String> carNames) {
        super(carNames);
    }

    @Override
    public List<String> convertCarNames() {
        return super.convertCarNames();
    }
}
