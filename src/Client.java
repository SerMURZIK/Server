import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket clientSocket = new Socket("127.0.0.1", 8787); // ждем подключения
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        ) {
            out.println("One string");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
