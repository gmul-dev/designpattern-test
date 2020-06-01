package modernJavaInAction.strategy;

public class Validator {
    private final ValidationStrategy validationStrategy;

    public Validator(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean validate(String s) {
        return validationStrategy.execute(s);
    }


    //한 유형의 알고리즘을 보유한 상태에서 런타임에 적절한 알고리즘을 선택하는 기법이다.
    public static void main(String[] agrs) {
        Validator numbericValidator = new Validator(new IsNumberic());
        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());

        //lambda
        Validator numbericLambda = new Validator((String s) -> s.matches("\\d+"));
        Validator lowerCaseLambda = new Validator((String s) -> s.matches("[a-z]+"));

        boolean b1 = numbericValidator.validate("aaaa");
        boolean b11 = numbericLambda.validate("aaaa");
        boolean b2 = lowerCaseValidator.validate("bbbb");
        boolean b22 = lowerCaseLambda.validate("bbbb");
    }
}


