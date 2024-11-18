import java.io.*;
import java.net.Socket;

public class Server extends Thread
{
    Socket mySocket;
    public Server(Socket socket)
// konstruktor
    {
        super();
// konstruktor klasy Thread
        mySocket = socket;
    }

    public void run ()// program wątku
    {
        try{
            int in;
            /* odbieramy i drukujemy ... */
            while(
                    (
                            in=
                                    mySocket.getInputStream().read()
                    ) >= 0
            )
                System.out.print( (char) in );
            mySocket.close();
        }
        catch(Exception e)
        { System.err.println( e ); }
    }
}

