import com.example.podam.grpc.MailServiceGrpc;
import com.example.podam.grpc.MailServiceProto.EmailRequest;
import com.example.podam.grpc.MailServiceProto.EmailResponse;
import io.grpc.stub.StreamObserver;

public class MailServiceImpl extends MailServiceGrpc.MailServiceImplBase {
    @Override
    public void sendEmail(EmailRequest request, StreamObserver<EmailResponse> responseObserver) {

        String asunto = request.getAsunto();
        String contenido = request.getContenido();
        String remitente = request.getRemitente();
        List<String> destinatarios = request.getDestinatariosList();

        EmailResponse response = EmailResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Correo enviado correctamente.")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
