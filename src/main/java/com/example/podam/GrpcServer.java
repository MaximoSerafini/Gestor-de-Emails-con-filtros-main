package com.example.podam;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9090)
                .addService(new ChatServiceImpl())
                .build()
                .start();

        System.out.println("Servidor gRPC puerto 9090");

        // esperar al server
        server.awaitTermination();
    }
}
