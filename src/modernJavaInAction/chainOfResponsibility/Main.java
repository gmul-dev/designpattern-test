package modernJavaInAction.chainOfResponsibility;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
//        ProcessingObject<String> p1 = new HeaderTextProcessing();
//        ProcessingObject<String> p2 = new SpellCheckerProcessing();
//        p1.setSuccessor(p2);
//        String result = p1.handle("Aren't labdas really sexy?!!");
//        System.out.println(result);

        UnaryOperator<String> headerTextProcessing =
                (String s) -> "From Raoul, Mario and Alan : " + s;
        UnaryOperator<String> spellCheckerProcessing =
                (String s) -> s.replaceAll("labda", "lambda");

        Function<String, String> pipeline =
                headerTextProcessing.andThen(spellCheckerProcessing);
        String result = pipeline.apply("Aren't labdas really sexy?!!");
        System.out.println(result);
    }
}
