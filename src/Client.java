import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket clientSocket = new Socket(InetAddress.getLocalHost(), 8787); // ждем подключения
        ) {
            System.out.println("One string");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
