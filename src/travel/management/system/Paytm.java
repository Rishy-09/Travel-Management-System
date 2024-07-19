package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Paytm extends JFrame implements ActionListener {
    private JButton back;

    Paytm() {
        setBounds(500, 200, 800, 600);
        setTitle("Paytm Payment");

        // Creating a JFXPanel
        JFXPanel jfxPanel = new JFXPanel();
        getContentPane().add(jfxPanel, BorderLayout.CENTER);

        // Adding a back button
        back = new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        getContentPane().add(back, BorderLayout.NORTH);

        // Initialize JavaFX
        Platform.runLater(() -> {
            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();

            webEngine.load("https://paytm.com/rent-payment");

            Scene scene = new Scene(webView);
            jfxPanel.setScene(scene);
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payment();
    }

    public static void main(String[] args) {
        // Ensure JavaFX is initialized
        SwingUtilities.invokeLater(() -> {
            new Paytm();
        });
    }
}
