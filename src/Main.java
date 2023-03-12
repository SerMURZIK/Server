import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {


    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8787)) { // порт можете выбрать любой в доступном диапазоне 0-65536. Но чтобы не нарваться на уже занятый - рекомендуем использовать около 8080
            try (Socket clientSocket = serverSocket.accept(); // ждем подключения
                 BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            ) {
                System.out.println("New connection accepted");

                final String name = in.readLine();

                System.out.printf("Hi %s, your port is %d%n", name, clientSocket.getPort());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
