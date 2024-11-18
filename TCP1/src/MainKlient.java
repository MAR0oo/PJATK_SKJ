import java.io.*;
import java.net.Socket;


public class MainKlient {
    public static void main(String[] args) throws IOException {
        int flag = 32132;
        String adress = "192.168.2";
        int port = 3333;

        Socket socket = new Socket(adress, port);
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        printWriter.println(flag);
        printWriter.println(adress + "" + port);

    }

}
