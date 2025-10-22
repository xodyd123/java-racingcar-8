package racingcar.domain.validator;

public class AttemptCountValidator implements Validator {
   private String inputUser ;

    public AttemptCountValidator(String inputUser) {
        this.inputUser = inputUser;
    }

    @Override
    public String validate() throws IllegalArgumentException {
        try{
            Integer.parseInt(inputUser) ;
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("에러");
        }
        return inputUser;
    }
}
