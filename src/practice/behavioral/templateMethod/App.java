package practice.behavioral.templateMethod;

/**
 * Template Method defines a skeleton for an algorithm. The algorithm subclasses provide
 * implementation for the blank parts.
 *
 * <p>In this example {@link HalflingThief} contains {@link StealingMethod} that can be changed.
 * First the thief hits with {@link HitAndRunMethod} and then with {@link SubtleMethod}.
 */
public class App {

    public static void main(String[] args) {
        var thief = new HalflingThief(new HitAndRunMethod());
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
