package FrontEnd;

//import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jake on 6/19/2015.
 */
public class MainView extends JFrame{
    private Button characterCreator, gmAssist;

    public MainView()
    {
        characterCreator = new Button("Create Character");
        gmAssist = new Button("Launch DM Assist");
        initAndShowGui();
    }

    public void initAndShowGui()
    {
        setTitle("Assist App");
        Panel panel = new Panel();
        panel.add(characterCreator);
        panel.add(gmAssist);
        add(panel);
        setSize(new Dimension(400,400));
//        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        MainView app = new MainView();
    }
}
