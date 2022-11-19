package org.example;

import com.google.common.util.concurrent.Uninterruptibles;
import com.google.rpc.context.AttributeContext;
import com.sherchan.ecommerce.Category;
import com.sherchan.ecommerce.ECommerceServiceGrpc;
import com.sherchan.ecommerce.OrderRequest;
import com.sherchan.ecommerce.OrderResponse;
import io.grpc.stub.StreamObserver;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static com.sherchan.ecommerce.Status.*;

public class AmazonOnlineService extends ECommerceServiceGrpc.ECommerceServiceImplBase {

    Map<Category, Consumer<StreamObserver<OrderResponse>>> categoryHandler = Map.of(
            Category.ELECTRONICS, this::handleElectronics,
            Category.EBOOK, this::handleEBooks
    );

    @Override
    public void placeOrder(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        categoryHandler.get(request.getOrderCategory()).accept(responseObserver);
        responseObserver.onCompleted();
    }

    private void handleElectronics(StreamObserver<OrderResponse> responseStreamObserver){
        Stream.of(PAYMENT_RECEIVED, SHIPPED, OUT_FOR_DELIVERY, DELIVERED)
                .map(OrderResponse.newBuilder()::setOrderStatus)
                .map(OrderResponse.Builder::build)
                .peek(i -> Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS))
                .forEach(responseStreamObserver::onNext);
    }

    private void handleEBooks(StreamObserver<OrderResponse> responseStreamObserver){
        Stream.of(PAYMENT_RECEIVED, DELIVERED)
                .map(OrderResponse.newBuilder()::setOrderStatus)
                .map(OrderResponse.Builder::build)
                .forEach(responseStreamObserver::onNext);
    }

}
