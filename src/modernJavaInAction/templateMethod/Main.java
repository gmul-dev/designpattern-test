package modernJavaInAction.templateMethod;

public class Main {
    public static void main(String[] args) {
        new OnlineBanking().processCustomerLambda(1337, (Customer c) -> System.out.println(c.getName()));
    }
}
