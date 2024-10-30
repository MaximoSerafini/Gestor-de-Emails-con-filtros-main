package com.example.podam.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.45.1)",
    comments = "Source: mail.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MailServiceGrpc {

  private MailServiceGrpc() {}

  public static final String SERVICE_NAME = "MailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.podam.grpc.MailServiceProto.EmailRequest,
      com.example.podam.grpc.MailServiceProto.EmailResponse> getSendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmail",
      requestType = com.example.podam.grpc.MailServiceProto.EmailRequest.class,
      responseType = com.example.podam.grpc.MailServiceProto.EmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.podam.grpc.MailServiceProto.EmailRequest,
      com.example.podam.grpc.MailServiceProto.EmailResponse> getSendEmailMethod() {
    io.grpc.MethodDescriptor<com.example.podam.grpc.MailServiceProto.EmailRequest, com.example.podam.grpc.MailServiceProto.EmailResponse> getSendEmailMethod;
    if ((getSendEmailMethod = MailServiceGrpc.getSendEmailMethod) == null) {
      synchronized (MailServiceGrpc.class) {
        if ((getSendEmailMethod = MailServiceGrpc.getSendEmailMethod) == null) {
          MailServiceGrpc.getSendEmailMethod = getSendEmailMethod =
              io.grpc.MethodDescriptor.<com.example.podam.grpc.MailServiceProto.EmailRequest, com.example.podam.grpc.MailServiceProto.EmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.podam.grpc.MailServiceProto.EmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.podam.grpc.MailServiceProto.EmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MailServiceMethodDescriptorSupplier("SendEmail"))
              .build();
        }
      }
    }
    return getSendEmailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MailServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MailServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MailServiceStub>() {
        @java.lang.Override
        public MailServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MailServiceStub(channel, callOptions);
        }
      };
    return MailServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MailServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MailServiceBlockingStub>() {
        @java.lang.Override
        public MailServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MailServiceBlockingStub(channel, callOptions);
        }
      };
    return MailServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MailServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MailServiceFutureStub>() {
        @java.lang.Override
        public MailServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MailServiceFutureStub(channel, callOptions);
        }
      };
    return MailServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MailServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendEmail(com.example.podam.grpc.MailServiceProto.EmailRequest request,
        io.grpc.stub.StreamObserver<com.example.podam.grpc.MailServiceProto.EmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.podam.grpc.MailServiceProto.EmailRequest,
                com.example.podam.grpc.MailServiceProto.EmailResponse>(
                  this, METHODID_SEND_EMAIL)))
          .build();
    }
  }

  /**
   */
  public static final class MailServiceStub extends io.grpc.stub.AbstractAsyncStub<MailServiceStub> {
    private MailServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MailServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendEmail(com.example.podam.grpc.MailServiceProto.EmailRequest request,
        io.grpc.stub.StreamObserver<com.example.podam.grpc.MailServiceProto.EmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MailServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MailServiceBlockingStub> {
    private MailServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MailServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.podam.grpc.MailServiceProto.EmailResponse sendEmail(com.example.podam.grpc.MailServiceProto.EmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendEmailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MailServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MailServiceFutureStub> {
    private MailServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MailServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MailServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.podam.grpc.MailServiceProto.EmailResponse> sendEmail(
        com.example.podam.grpc.MailServiceProto.EmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EMAIL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MailServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MailServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((com.example.podam.grpc.MailServiceProto.EmailRequest) request,
              (io.grpc.stub.StreamObserver<com.example.podam.grpc.MailServiceProto.EmailResponse>) responseObserver);
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

  private static abstract class MailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.podam.grpc.MailServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MailService");
    }
  }

  private static final class MailServiceFileDescriptorSupplier
      extends MailServiceBaseDescriptorSupplier {
    MailServiceFileDescriptorSupplier() {}
  }

  private static final class MailServiceMethodDescriptorSupplier
      extends MailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MailServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MailServiceFileDescriptorSupplier())
              .addMethod(getSendEmailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
