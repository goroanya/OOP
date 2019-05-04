
import Strategy.CustomerStrategy;
import Strategy.UserStrategy;
import Strategy.WorkerStrategy;
import Users.User;
import Data.Workers;

import javax.swing.*;
import java.awt.*;

public class StartForm extends JFrame {
    private JButton WorkerBtn;
    private JButton CustomerBtn;
    private JPanel StartPanel;

    private Workers workers = new Workers();
    private UserStrategy strategy = new UserStrategy();

    private User currentUser;

    public StartForm() {


        add(StartPanel);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        WorkerBtn.addActionListener(e -> {

            JFrame frame = new JFrame("Checking secret code");
            String secretCode = JOptionPane.showInputDialog(
                    frame,
                    "Enter secret code",
                    "Secret code needed",
                    JOptionPane.QUESTION_MESSAGE);

            boolean permission = workers.isWorker(secretCode);


            if (permission) {

                this.currentUser = workers.getWorker(secretCode);

                JOptionPane.showMessageDialog(
                        new Frame("Successful login to the system"),
                        "Welcome, " + currentUser.getFullname(),
                        "Login to the system",
                        JOptionPane.INFORMATION_MESSAGE);


                //open worker frame by strategy
                strategy.setFormChooser(new WorkerStrategy());

            } else {
                JOptionPane.showMessageDialog(

                        new Frame("Failed login"),
                        "Permission denied",
                        "Unsuccessful login to the system",
                        JOptionPane.ERROR_MESSAGE);
            }
            setVisible(false);
            strategy.openNextForm();
        });

        CustomerBtn.addActionListener(e -> {
            setVisible(false);

            //open customer frame by strategy and open it
            strategy.setFormChooser(new CustomerStrategy());
            strategy.openNextForm();
        });
    }

}


