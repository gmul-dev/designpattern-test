package modernJavaInAction.templateMethod;

import java.util.function.Consumer;

public class OnlineBanking {
    // 추상메서드를 람다를 이용해 구현
    public void processCustomerLambda(int id, Consumer<Customer> makeCustomerHappy){
        Customer c = new Customer();
        makeCustomerHappy.accept(c);
    }
}

//abstract class OnlineBanking {
//    public void processCustomer(int id) {
//        Customer c = new Customer();
//        makeCustomerHappy(c);
//    }
//    abstract void makeCustomerHappy(Customer c);
//}


