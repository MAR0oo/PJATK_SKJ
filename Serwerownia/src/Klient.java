import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Klient {
    public static void main(String[] args) throws IOException {

        //Flaga ustalona przez admina
        int startFlag = 569;
        //Ustalasz swoje IP i Port  w wierszu poleceń komenda: ipconfig
        String adress = "192.168.1.10";
        int ourPort = 787;
        //IP i Port od admina
        String serverAdress = "192.167.1.69";
        int serverPort = 000;


        Socket socket = new Socket(serverAdress, serverPort);
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        printWriter.println(startFlag);
        printWriter.println(adress +":"+ ourPort);

    }
}
