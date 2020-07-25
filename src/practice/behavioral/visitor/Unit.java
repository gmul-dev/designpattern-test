package practice.behavioral.visitor;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public abstract class Unit {

    private Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVisitor visitor) {
        Arrays.stream(children).forEach(child -> child.accept(visitor));
    }
}
