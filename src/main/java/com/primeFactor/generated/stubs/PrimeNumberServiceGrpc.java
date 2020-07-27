package com.primeFactor.generated.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: primeNumber.proto")
public final class PrimeNumberServiceGrpc {

  private PrimeNumberServiceGrpc() {}

  public static final String SERVICE_NAME = "prime.PrimeNumberService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest,
      com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse> getPrimeNumberDecompositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrimeNumberDecomposition",
      requestType = com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest.class,
      responseType = com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest,
      com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse> getPrimeNumberDecompositionMethod() {
    io.grpc.MethodDescriptor<com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest, com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse> getPrimeNumberDecompositionMethod;
    if ((getPrimeNumberDecompositionMethod = PrimeNumberServiceGrpc.getPrimeNumberDecompositionMethod) == null) {
      synchronized (PrimeNumberServiceGrpc.class) {
        if ((getPrimeNumberDecompositionMethod = PrimeNumberServiceGrpc.getPrimeNumberDecompositionMethod) == null) {
          PrimeNumberServiceGrpc.getPrimeNumberDecompositionMethod = getPrimeNumberDecompositionMethod = 
              io.grpc.MethodDescriptor.<com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest, com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "prime.PrimeNumberService", "PrimeNumberDecomposition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PrimeNumberServiceMethodDescriptorSupplier("PrimeNumberDecomposition"))
                  .build();
          }
        }
     }
     return getPrimeNumberDecompositionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrimeNumberServiceStub newStub(io.grpc.Channel channel) {
    return new PrimeNumberServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrimeNumberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PrimeNumberServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrimeNumberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PrimeNumberServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PrimeNumberServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void primeNumberDecomposition(com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest request,
        io.grpc.stub.StreamObserver<com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrimeNumberDecompositionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPrimeNumberDecompositionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest,
                com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse>(
                  this, METHODID_PRIME_NUMBER_DECOMPOSITION)))
          .build();
    }
  }

  /**
   */
  public static final class PrimeNumberServiceStub extends io.grpc.stub.AbstractStub<PrimeNumberServiceStub> {
    private PrimeNumberServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeNumberServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeNumberServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeNumberServiceStub(channel, callOptions);
    }

    /**
     */
    public void primeNumberDecomposition(com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest request,
        io.grpc.stub.StreamObserver<com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPrimeNumberDecompositionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrimeNumberServiceBlockingStub extends io.grpc.stub.AbstractStub<PrimeNumberServiceBlockingStub> {
    private PrimeNumberServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeNumberServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeNumberServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeNumberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse> primeNumberDecomposition(
        com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPrimeNumberDecompositionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrimeNumberServiceFutureStub extends io.grpc.stub.AbstractStub<PrimeNumberServiceFutureStub> {
    private PrimeNumberServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrimeNumberServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeNumberServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrimeNumberServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PRIME_NUMBER_DECOMPOSITION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrimeNumberServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrimeNumberServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRIME_NUMBER_DECOMPOSITION:
          serviceImpl.primeNumberDecomposition((com.primeFactor.generated.stubs.PrimeNumberDecompositionRequest) request,
              (io.grpc.stub.StreamObserver<com.primeFactor.generated.stubs.PrimeNumberDecompositionResponse>) responseObserver);
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

  private static abstract class PrimeNumberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrimeNumberServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.primeFactor.generated.stubs.PrimeNumber.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrimeNumberService");
    }
  }

  private static final class PrimeNumberServiceFileDescriptorSupplier
      extends PrimeNumberServiceBaseDescriptorSupplier {
    PrimeNumberServiceFileDescriptorSupplier() {}
  }

  private static final class PrimeNumberServiceMethodDescriptorSupplier
      extends PrimeNumberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrimeNumberServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrimeNumberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrimeNumberServiceFileDescriptorSupplier())
              .addMethod(getPrimeNumberDecompositionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
