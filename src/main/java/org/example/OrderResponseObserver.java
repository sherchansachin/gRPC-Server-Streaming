package org.example;

import com.sherchan.ecommerce.OrderResponse;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;

public class OrderResponseObserver implements StreamObserver<OrderResponse> {

    @Override
    public void onNext(OrderResponse orderResponse) {
        System.out.println(LocalDateTime.now() + " : " + orderResponse);
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onCompleted() {

    }
}
