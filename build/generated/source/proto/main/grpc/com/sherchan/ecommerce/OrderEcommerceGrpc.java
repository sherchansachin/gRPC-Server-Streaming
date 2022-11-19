package com.sherchan.ecommerce;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: ecommerce/Ecommerce.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderEcommerceGrpc {

  private OrderEcommerceGrpc() {}

  public static final String SERVICE_NAME = "ecommerce.OrderEcommerce";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sherchan.ecommerce.OrderRequest,
      com.sherchan.ecommerce.OrderResponse> getPlaceOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "placeOrder",
      requestType = com.sherchan.ecommerce.OrderRequest.class,
      responseType = com.sherchan.ecommerce.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.sherchan.ecommerce.OrderRequest,
      com.sherchan.ecommerce.OrderResponse> getPlaceOrderMethod() {
    io.grpc.MethodDescriptor<com.sherchan.ecommerce.OrderRequest, com.sherchan.ecommerce.OrderResponse> getPlaceOrderMethod;
    if ((getPlaceOrderMethod = OrderEcommerceGrpc.getPlaceOrderMethod) == null) {
      synchronized (OrderEcommerceGrpc.class) {
        if ((getPlaceOrderMethod = OrderEcommerceGrpc.getPlaceOrderMethod) == null) {
          OrderEcommerceGrpc.getPlaceOrderMethod = getPlaceOrderMethod =
              io.grpc.MethodDescriptor.<com.sherchan.ecommerce.OrderRequest, com.sherchan.ecommerce.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "placeOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sherchan.ecommerce.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sherchan.ecommerce.OrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderEcommerceMethodDescriptorSupplier("placeOrder"))
              .build();
        }
      }
    }
    return getPlaceOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderEcommerceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderEcommerceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderEcommerceStub>() {
        @java.lang.Override
        public OrderEcommerceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderEcommerceStub(channel, callOptions);
        }
      };
    return OrderEcommerceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderEcommerceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderEcommerceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderEcommerceBlockingStub>() {
        @java.lang.Override
        public OrderEcommerceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderEcommerceBlockingStub(channel, callOptions);
        }
      };
    return OrderEcommerceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderEcommerceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderEcommerceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderEcommerceFutureStub>() {
        @java.lang.Override
        public OrderEcommerceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderEcommerceFutureStub(channel, callOptions);
        }
      };
    return OrderEcommerceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrderEcommerceImplBase implements io.grpc.BindableService {

    /**
     */
    public void placeOrder(com.sherchan.ecommerce.OrderRequest request,
        io.grpc.stub.StreamObserver<com.sherchan.ecommerce.OrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaceOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlaceOrderMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.sherchan.ecommerce.OrderRequest,
                com.sherchan.ecommerce.OrderResponse>(
                  this, METHODID_PLACE_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class OrderEcommerceStub extends io.grpc.stub.AbstractAsyncStub<OrderEcommerceStub> {
    private OrderEcommerceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderEcommerceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderEcommerceStub(channel, callOptions);
    }

    /**
     */
    public void placeOrder(com.sherchan.ecommerce.OrderRequest request,
        io.grpc.stub.StreamObserver<com.sherchan.ecommerce.OrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderEcommerceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrderEcommerceBlockingStub> {
    private OrderEcommerceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderEcommerceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderEcommerceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.sherchan.ecommerce.OrderResponse> placeOrder(
        com.sherchan.ecommerce.OrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPlaceOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderEcommerceFutureStub extends io.grpc.stub.AbstractFutureStub<OrderEcommerceFutureStub> {
    private OrderEcommerceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderEcommerceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderEcommerceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PLACE_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderEcommerceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderEcommerceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLACE_ORDER:
          serviceImpl.placeOrder((com.sherchan.ecommerce.OrderRequest) request,
              (io.grpc.stub.StreamObserver<com.sherchan.ecommerce.OrderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OrderEcommerceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderEcommerceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sherchan.ecommerce.Ecommerce.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderEcommerce");
    }
  }

  private static final class OrderEcommerceFileDescriptorSupplier
      extends OrderEcommerceBaseDescriptorSupplier {
    OrderEcommerceFileDescriptorSupplier() {}
  }

  private static final class OrderEcommerceMethodDescriptorSupplier
      extends OrderEcommerceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderEcommerceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OrderEcommerceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderEcommerceFileDescriptorSupplier())
              .addMethod(getPlaceOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
