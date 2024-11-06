package com.example.podam;

import io.grpc.stub.StreamObserver;

public class ChatServiceImpl extends ChatServiceGrpc.ChatServiceImplBase {
    @Override
    public void sendMessage(MessageRequest request, StreamObserver<MessageReply> responseObserver) {
        // Crear respuesta
        MessageReply reply = MessageReply.newBuilder()
                .setResponse("Recibido: " + request.getContent())
                .build();

        // Enviar respuesta
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
