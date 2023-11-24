import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ClientSocket clientSocket = new ClientSocket();
        clientSocket.startConnection("127.0.0.1", 4000);
//        String message = "";
//        File file = new File(
//                "C:\\Users\\user\\IdeaProjects\\clientSocket\\src\\test.txt");
//        Scanner sc = new Scanner(file);
//
//        while (sc.hasNextLine())
//            message = sc.nextLine();
//
//        clientSocket.sendMessage(message);

//        using input field
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your message: ");

        String clientMessage = myObj.nextLine();
        clientSocket.sendMessage(clientMessage);
    }
}
