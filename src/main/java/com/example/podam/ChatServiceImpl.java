package com.example.podam;

import io.grpc.stub.StreamObserver;

public class ChatServiceImpl extends ChatServiceGrpc.ChatServiceImplBase {
    @Override
    public void sendMessage(MessageRequest request, StreamObserver<MessageReply> responseObserver) {
        // crear respuesta
        MessageReply reply = MessageReply.newBuilder()
                .setResponse("Recibido: " + request.getContent())
                .build();

        // enviar respuesta
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
