package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AmazonServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(1234).addService(new AmazonOnlineService()).build();

        server.start();


        System.out.println("Server started at: " + server.getPort());

        // shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Amazon server is shutting down!");
            server.shutdown();
        }));

        server.awaitTermination();
    }
}
