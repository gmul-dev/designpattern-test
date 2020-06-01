package modernJavaInAction.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ProductFactory {
//    public static Product createProduct(String name) {
//        switch (name) {
//            case "loan" : return new Loan();
//            case "stock" : return new Stock();
//            default: throw new RuntimeException("No such product " + name);
//        }
//    }

    //lambda를 이용해 switch -> map으로 구현
    //파라미터가 여러개가 되면 아래와 같이 적용하기 어렵다.. 복잡...
//    public interface TriFunction<T,U,V,R> {
//        R apply(T t, U u, V v);
//    }
//    Map<String, TriFunction<Integer, Integer, String, Product>> map = new HashMap<>();

    final static Map<String, Supplier<Product>> map = new HashMap<>();
    static {
        map.put("loan", Loan::new);
        map.put("stock", Stock::new);
    }

    public static Product createProduct(String name) {
        Supplier<Product> p = map.get(name);
        if(p != null) return p.get();
        throw new RuntimeException("No such product " + name);
    }

    public static void main(String[] args){
        Product p = ProductFactory.createProduct("Loan");

        Supplier<Product> loanSupplier = Loan::new;
        Product loan = loanSupplier.get();
    }
}
class Product {}
class Loan extends Product {}
class Stock extends Product {}