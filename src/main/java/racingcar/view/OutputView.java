package racingcar.view;

import racingcar.domain.Car;

import java.util.List;


public interface OutputView {

    void printCarNamesPrompt();

    void printAttemptCountPrompt();

    void printRoundResultPrompt();

    void printPlayerRoundResult(List<Car> cars);

    void printWinner(List<String> winnersResult);
}
