import io.grpc.Server;
import io.grpc.ServerBuilder;

public class MailServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(50051) // server creado en el puerto
                .addService(new MailServiceImpl())
                .build()
                .start();

        server.awaitTermination();
    }
}
