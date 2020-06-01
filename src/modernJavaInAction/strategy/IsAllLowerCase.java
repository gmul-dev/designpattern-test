package modernJavaInAction.strategy;

public class IsAllLowerCase implements ValidationStrategy {
    public boolean execute(String s) {
        return s.matches("[a-x]+");
    }
}

