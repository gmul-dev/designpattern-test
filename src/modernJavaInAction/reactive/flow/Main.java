package modernJavaInAction.reactive.flow;

import modernJavaInAction.observer.Observer;

import java.util.concurrent.Flow.*;

public class Main {
    public static void main(String[] args) {

        getCelsiusTemperatures("New York").subscribe(new TempSubscriber());

        //getTemperatures("New York").subscribe(new TempSubscriber());
    }

    private static Publisher<TempInfo> getTemperatures(String town) {
        //구독한 subscriber에서 subscription을 전송하는 publisher를 반환
        return subscriber -> subscriber.onSubscribe(new TempSubscription(subscriber, town));
    }

    private static Publisher<TempInfo> getCelsiusTemperatures(String town) {
        return subscriber -> {
            TempProcessor processor = new TempProcessor(); // TempProcessor를 만들고 Subscriber와 반환된 publisher사이로 연결
            processor.subscribe(subscriber);
            processor.onSubscribe(new TempSubscription(processor, town));
        };
    }
}
