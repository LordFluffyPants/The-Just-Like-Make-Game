package FrontEnd;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jake on 6/19/2015.
 */
public class MainView extends JFrame implements ActionListener{
    private Button characterCreator, gmAssist;

    public MainView()
    {
        characterCreator = new Button("Create Character");
        characterCreator.addActionListener(this);
        gmAssist = new Button("Launch DM Assist");
        gmAssist.addActionListener(this);
        initAndShowGui();
    }

    public void initAndShowGui()
    {
        setTitle("Assist App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel comboPanel = new JPanel();
        comboPanel.add(characterCreator);
        comboPanel.add(gmAssist);

        add(comboPanel, BorderLayout.CENTER);

//        setUndecorated(true); //TODO have this be set in a cfg file
//        setIconImage(); //TODO create an icon image for the app and import it here
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }


    public static void main(String [] args)
    {
        MainView app = new MainView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == characterCreator)
        {
            dispose();
        }
        if (e.getSource() == gmAssist)
        {
            dispose();
        }
    }
}
