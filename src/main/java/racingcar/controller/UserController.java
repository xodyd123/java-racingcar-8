package racingcar.controller;

import racingcar.domain.racing.Car;
import racingcar.domain.racing.RacingGame;
import racingcar.domain.converter.Converter;
import racingcar.domain.converter.IntConverter;
import racingcar.domain.converter.StringArrayConverter;
import racingcar.domain.dto.reponse.ResponseUserDto;
import racingcar.domain.dto.request.AttemptCountDto;
import racingcar.domain.dto.request.CarNameDto;
import racingcar.domain.dto.request.UserDto;
import racingcar.domain.validator.AttemptCountValidator;
import racingcar.domain.validator.CarNameValidator;
import racingcar.domain.validator.Validator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

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
        outputView.printAttemptCountPrompt();
        String attemptCount = validate(new AttemptCountValidator(inputView.readAttemptCount()));
        initRacingGame(carName, attemptCount);
    }

    private void initRacingGame(String carName, String attemptCount) {
        ResponseUserDto convertCarName = convert(new StringArrayConverter(), new CarNameDto(carName));
        ResponseUserDto convertAttemptCount  = convert(new IntConverter(), new AttemptCountDto(attemptCount));
        RacingGame racingGame = new RacingGame(convertCarName.convertCarNames());
        int count = convertAttemptCount.convertAttemptCount();
        playRacingGame(count, racingGame);
        winnerResult(racingGame, count);
    }

    private void playRacingGame(int count, RacingGame racingGame) {
        outputView.printRoundResultPrompt();
        for (int i = 0; i < count; i++) {
            List<Car> cars = racingGame.play();
            outputView.printPlayerRoundResult(cars);
            outputView.printBlankLine();
        }
    }

    private void winnerResult(RacingGame racingGame, int count) {
        List<String> winnersResult = racingGame.winnerResult(count);
        outputView.printWinner(winnersResult);
    }


    public String validate(Validator validator) {
        return validator.validate();
    }

    public ResponseUserDto convert(Converter converter , UserDto userDto) {
        return converter.convert(userDto);
    }


}
