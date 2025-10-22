package racingcar.view;

public class ConsoleOutView implements OutputView {

    @Override
    public void printCarNamesPrompt() {
        System.out.println(CliText.PROMPT_CAR_NAMES);

    }

    @Override
    public void printAttemptCountPrompt() {
        System.out.println(CliText.PROMPT_ROUND_COUNT);
    }
}
