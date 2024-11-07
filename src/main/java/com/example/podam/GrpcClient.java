package com.example.podam;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        // crea canal
        ManagedChannel channel = ManagedChannelBuilder.forAddress("181.106.218.71", 9090)//probar ip
                .usePlaintext()
                .build();

        // stub servicio
        ChatServiceGrpc.ChatServiceBlockingStub stub = ChatServiceGrpc.newBlockingStub(channel);

        // build solicitud y enviar
        MessageRequest request = MessageRequest.newBuilder()
                .setContent("Hola")
                .build();

        // get respuesta
        MessageReply response = stub.sendMessage(request);
        System.out.println("Respuesta del servidor: " + response.getResponse());

        // cerrar canal
        channel.shutdown();
    }
}
