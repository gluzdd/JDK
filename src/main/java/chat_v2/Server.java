package chat_v2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Server implements Clickable{
    boolean isConnect;
    Listenerable action;
    StringBuilder textlog;
    private static final String fileName = "./src/main/java/chat_v2/log_file.txt";

    public Server(Listenerable action) {
        this.isConnect = false  ;
        this.action = action;
    }

    @Override
    public void sendMessage(String textMsg) {
        textlog.append(textMsg + "\n");
        action.buttonAction(textMsg + "\n");
    }

    @Override
    public void disconnect() {
        try (FileWriter fw = new FileWriter(Server.fileName)) {
            fw.write(textlog.toString());
            fw.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void login(String login, String password) {
        textlog = new StringBuilder();
        try (BufferedReader br = new BufferedReader(
                new FileReader(Server.fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                textlog.append(line).append("\n");
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        action.buttonAction(textlog.toString());
    }
}


