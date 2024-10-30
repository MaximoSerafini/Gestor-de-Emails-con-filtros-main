import com.example.podam.grpc.MailServiceGrpc;
import com.example.podam.grpc.MailServiceProto.EmailRequest;
import com.example.podam.grpc.MailServiceProto.EmailResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class MailClient {
    private final MailServiceGrpc.MailServiceBlockingStub mailStub;

    public MailClient(String host, int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        mailStub = MailServiceGrpc.newBlockingStub(channel);
    }

    public void sendEmail(String asunto, String contenido, String remitente, List<String> destinatarios) {
        EmailRequest request = EmailRequest.newBuilder()
                .setAsunto(asunto)
                .setContenido(contenido)
                .setRemitente(remitente)
                .addAllDestinatarios(destinatarios)
                .build();

        EmailResponse response = mailStub.sendEmail(request);

        //test------------------------------------------
        if (response.getSuccess()) {
            System.out.println("Correo enviado: " + response.getMessage());
        } else {
            System.err.println("Error al enviar el correo: " + response.getMessage());
        }
    }
}
