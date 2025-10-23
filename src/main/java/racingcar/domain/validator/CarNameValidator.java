package racingcar.domain.validator;

import java.util.Arrays;

public class CarNameValidator implements Validator {
    private String inputUser ;

    public CarNameValidator(String inputUser) {
        this.inputUser = inputUser;
    }

    @Override
    public String validate() throws IllegalArgumentException {
        if (inputUser.isEmpty() || !inputUser.contains(",")) {
            throw new IllegalArgumentException("에러");
        }

        return validateCarNameLength(inputUser);
    }

    private String validateCarNameLength(String carName) {
        String[] carNames = carName.split(",");
        for (String name : carNames) {
            if(name.length() > 5) {
                throw new IllegalArgumentException("에러");
            }
        }
        return carName;
    }
}
