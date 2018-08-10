package springcloud.hystrix.rx;


import rx.Observable;
import rx.Subscriber;

import java.util.Random;

public class RxJavaDemo {

    public static void main(String[] args) {

        //创建一个事件源 observable
        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>(){
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("hello rxjava");
            //    subscriber.onNext("hello sd");
                subscriber.onCompleted();
            }
        });
        Random random = new Random();
        // 创建订阅者 subscriber
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                System.out.println("熔断保护！");
            }

            @Override
            public void onNext(String s) {
                // 如果随机时间 大于 100 ，那么触发容错
                int value = random.nextInt(200);

                if (value > 100) {
                    throw new RuntimeException("Timeout!");
                }

                System.out.println("helloWorld() costs " + value + " ms.");


                System.out.println("subscriber: "+s);
            }
        };


        // 订阅
        observable.subscribe(subscriber);

    }

}
