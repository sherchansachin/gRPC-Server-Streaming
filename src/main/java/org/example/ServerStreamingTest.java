package org.example;

import com.sherchan.ecommerce.Category;
import com.sherchan.ecommerce.ECommerceServiceGrpc;
import com.sherchan.ecommerce.OrderRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ServerStreamingTest {

    private ManagedChannel channel;

    private ECommerceServiceGrpc.ECommerceServiceStub clientStub;

//    set up channel
    @Before
    public void setup(){
        this.channel = ManagedChannelBuilder.forAddress("localhost", 1234)
                .usePlaintext()
                .build();
        this.clientStub = ECommerceServiceGrpc.newStub(channel);
    }

    @Test
    public void bookStreamingTest() throws InterruptedException {
        OrderRequest ebook = OrderRequest.newBuilder().setOrderCategory(Category.EBOOK).build();
        this.clientStub.placeOrder(ebook, new OrderResponseObserver());
    }

    @Test
    public void electronicStreamingTest() throws InterruptedException {
        OrderRequest electronic = OrderRequest.newBuilder().setOrderCategory(Category.ELECTRONICS).build();
        this.clientStub.placeOrder(electronic, new OrderResponseObserver());
    }

    @After
    public void teardown(){
        this.channel.shutdown();
    }
}
