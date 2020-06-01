package modernJavaInAction.strategy;

public class IsNumberic implements ValidationStrategy {
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
