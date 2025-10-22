package racingcar.controller;

import racingcar.domain.converter.Converter;
import racingcar.domain.converter.IntConverter;
import racingcar.domain.converter.StringArrayConverter;
import racingcar.domain.dto.reponse.ResponseAttemptCountDto;
import racingcar.domain.dto.reponse.ResponseCarNameDto;
import racingcar.domain.dto.reponse.ResponseUserDto;
import racingcar.domain.dto.request.AttemptCountDto;
import racingcar.domain.dto.request.CarNameDto;
import racingcar.domain.dto.request.UserDto;
import racingcar.domain.validator.AttemptCountValidator;
import racingcar.domain.validator.CarNameValidator;
import racingcar.domain.validator.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Arrays;

public class UserController {
    private final OutputView outputView;

    private final InputView inputView;

    public UserController(OutputView outputView, InputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void run() {
        outputView.printCarNamesPrompt();
        String carName = validate(new CarNameValidator(inputView.readCarNames()));
        ResponseUserDto convert = convert(new StringArrayConverter(), new CarNameDto(carName));
        outputView.printAttemptCountPrompt();
        String attemptCount = validate(new AttemptCountValidator(inputView.readAttemptCount()));
        ResponseUserDto convert1 = convert(new IntConverter(), new AttemptCountDto(attemptCount));
        if(convert instanceof ResponseCarNameDto) {
            String[] responseCarNameDto = convert.convertCarNames();
        }
        if(convert1 instanceof ResponseAttemptCountDto) {
            int num = convert1.convertAttemptCount();
        }
    }

    public String validate(Validator validator) {
        return validator.validate();
    }

    public ResponseUserDto convert(Converter converter , UserDto userDto) {
        return converter.convert(userDto);
    }


}
