package practice.behavioral.visitor;

public class CommanderVisitor implements UnitVisitor {
    @Override
    public void visitSoldier(Soldier soldier) {
        //nothing
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        //nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        System.out.println("Good to see you " + commander);
    }
}
