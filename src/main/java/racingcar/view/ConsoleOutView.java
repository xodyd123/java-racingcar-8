package racingcar.view;

import racingcar.domain.racing.Car;

import java.util.List;

import static racingcar.view.CliText.*;

public class ConsoleOutView implements OutputView {

    @Override
    public void printCarNamesPrompt() {
        System.out.println(PROMPT_CAR_NAMES);

    }

    @Override
    public void printAttemptCountPrompt() {
        System.out.println(PROMPT_ROUND_COUNT);
    }

    @Override
    public void printRoundResultPrompt() {
        System.out.println();
        System.out.println(PROMPT_PLAY_RESULT);
    }

    @Override
    public void printPlayerRoundResult(List<Car> cars) {
        cars.stream().forEach(car -> {
            System.out.println(car);
        });
    }


    @Override
    public void printWinner(List<String> winners) {
        String winnersResult = "" ;
        for (String s : winners) {
            winnersResult += s + ", ";
        }

        System.out.println(PROMPT_WINNER + " : " + winnersResult.substring(0, winnersResult.length() - 2));
    }

    @Override
    public void printBlankLine() {
        System.out.println();
    }


}
