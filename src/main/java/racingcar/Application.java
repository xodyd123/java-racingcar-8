package racingcar;

import racingcar.controller.UserController;
import racingcar.view.ConsoleInputView;
import racingcar.view.ConsoleOutView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        UserController userController = new UserController(new ConsoleOutView(), new ConsoleInputView());
        userController.run();
    }
}
