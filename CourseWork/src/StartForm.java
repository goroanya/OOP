import Proxy.DepartmentStaff;
import Users.User;
import Data.Workers;

import javax.swing.*;
import java.awt.*;

public class StartForm extends JFrame {
    private JButton WorkerBtn;
    private JButton CustomerBtn;
    private JPanel StartPanel;

    private DepartmentStaff departmentStaff = new DepartmentStaff();

    private User currentUser;

    public StartForm() {


        add(StartPanel);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        WorkerBtn.addActionListener(e -> {

            JFrame frame= new JFrame("Checking secret code");
            String secretCode = JOptionPane.showInputDialog(
                    frame,
                    "Enter secret code",
                    "Secret code needed",
                    JOptionPane.QUESTION_MESSAGE);

            //PROXY
            boolean permission = departmentStaff.getPermission(secretCode);

            if (permission) {

                this.currentUser = departmentStaff.getWorker(secretCode);

                JOptionPane.showMessageDialog(
                        new Frame("Successful login to the system"),
                        "Welcome, " + currentUser.getFullname(),
                        "Login to the system",
                        JOptionPane.INFORMATION_MESSAGE);

                setVisible(false);
                //open worker frame

            } else JOptionPane.showMessageDialog(
                    new Frame("Failed login"),
                    "Permission denied",
                    "Unsuccessful login to the system",
                    JOptionPane.ERROR_MESSAGE);
        });

        CustomerBtn.addActionListener(e -> {
            setVisible(false);
            //open customer frame
        });
    }

}


