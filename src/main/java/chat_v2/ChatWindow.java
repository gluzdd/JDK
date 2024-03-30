package chat_v2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class ChatWindow extends JFrame implements Listenerable{
    private static final int WINDOW_HEIGHT = 300;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 500;
    private static final int WINDOW_POSY = 100;
    Server server;
    private final JPanel panelTop = new JPanel(new GridLayout(3, 2));
    private final JTextField tfIPAddress = new JTextField("127.0.0.1");
    private final JTextField tfPort = new JTextField("8888");
    private final JTextField tfLogin = new JTextField("your_login");
    private final JPasswordField tfPassword = new JPasswordField("password");
    private final JButton btnLogin = new JButton("Login");
    private final JButton btnLogout = new JButton("Logout");
    private final JPanel panelBottom = new JPanel(new GridLayout(1, 2));
    private final JTextField ftMessage = new JTextField("Enter your message");
    private final JButton btnSend = new JButton("Send");
    final JTextArea log = new JTextArea();
    public ChatWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Chat Client");
        setResizable(true);


        panelTop.add(tfIPAddress);
        panelTop.add(tfPort);
        panelTop.add(tfLogin);
        panelTop.add(tfPassword);
        panelTop.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.callMethodIF();
            }
        });
        panelTop.add(btnLogout);
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.logout();
            }
        });

        panelBottom.add(ftMessage);
        ftMessage.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    server.sendChat(ftMessage.getText());
                }
            }
        });
        panelBottom.add(btnSend);
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.sendChat(ftMessage.getText());
            }
        });

        add(panelBottom, BorderLayout.SOUTH);
        add(panelTop, BorderLayout.NORTH);

        log.setEditable(false);
        JScrollPane scrollLog = new JScrollPane(log);
        add(scrollLog);
        setVisible(true);

        server = new Server(this);

    }
    @Override
    public void buttonAction(String str) {
        log.append(str);
    }
}
