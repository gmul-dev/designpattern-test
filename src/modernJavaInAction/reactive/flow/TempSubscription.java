package modernJavaInAction.reactive.flow;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow.*;

public class TempSubscription implements Subscription {

    private final Subscriber<? super TempInfo> subscriber;
    private final String town;

    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    public TempSubscription(Subscriber<? super TempInfo> subscriber, String town) {
        this.subscriber = subscriber;
        this.town = town;
    }

//    @Override
//    public void request(long l) {
//        /subscriber가 만든 요청을 1개씩 반복
//        for(long i = 0L; i < l; i++) {
//            try {
//                subscriber.onNext(TempInfo.fetch(town));
//            } catch (Exception e) {
//                //실패시 subscriber로 에러를 전달
//                subscriber.onError(e);
//                break;
//            }
//        }
//    }

    @Override
    public void request(long l) {
        //다른 쓰레드에서 다음 요소를 구독자에서 전송
        executor.submit(() -> {
            for(long i = 0L; i < l; i++) {
                try {
                    subscriber.onNext(TempInfo.fetch(town));
                } catch (Exception e) {
                    //실패시 subscriber로 에러를 전달
                    subscriber.onError(e);
                    break;
                }
            }
        });
    }

    @Override
    public void cancel() {
        // 구독 취소시 완료 신호를 subscriber로 전
        subscriber.onComplete();
    }
}
