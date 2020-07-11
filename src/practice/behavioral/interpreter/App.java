package practice.behavioral.interpreter;

import java.util.Stack;

/**
 * The Interpreter pattern is a design pattern that specifies how to evaluate sentences in a
 * language. The basic idea is to have a class for each symbol (terminal or nonterminal) in a
 * specialized computer language. The syntax tree of a sentence in the language is an instance of
 * the composite pattern and is used to evaluate (interpret) the sentence for a client.
 *
 * <p>In this example we use the Interpreter pattern to break sentences into expressions ({@link
 * Expression}) that can be evaluated and as a whole form the result.
 */

public class App {

    /**
     * Program entry point.
     *
     * <p>Expressions can be evaluated using prefix, infix or postfix notations This sample uses
     * postfix, where operator comes after the operands.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        var tokenString = "4 3 2 - 1 + *";
        var stack = new Stack<Expression>();

        var tokenList = tokenString.split(" ");
        for(var s : tokenList) {
            if(isOperation(s)) {
                var rightExpression = stack.pop();
                var leftExpression = stack.pop();
                System.out.println("popped from stack left: " + leftExpression.interpret() + " right: " + rightExpression.interpret());

                var operator = getOperationInstance(s, leftExpression, rightExpression);
                System.out.println("operator: " + operator);

                var result = operator.interpret();
                var resultExpressoin = new NumberExpression(result);
                stack.push(resultExpressoin);
            } else {
                var i = new NumberExpression(s);
                stack.push(i);
                System.out.println("push to stack: " + i.interpret());
            }
        }
        System.out.println("result: " + stack.pop().interpret());
    }

    public static boolean isOperation(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    public static Expression getOperationInstance(String s, Expression left, Expression right) {
        switch (s) {
            case "+" :
                return new PlusExpression(left, right);
            case "-" :
                return new MinusExpression(left, right);
            case "*" :
            default :
                return new MultiplyExpression(left, right);
        }
    }
}
