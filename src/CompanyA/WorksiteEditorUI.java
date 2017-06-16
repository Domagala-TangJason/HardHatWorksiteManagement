package CompanyA;

import javax.swing.*;

/**
 * Created by Jason on 6/14/2017.
 */
public class WorksiteEditorUI {
    private JTextArea belowYouCanAddTextArea;
    private JButton addNewTaskButton;
    private JButton previousButton;
    private JButton editTasksButton;
    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox yesCheckBox;
    private JCheckBox noCheckBox;
    private JPanel mainPanel;
}

public WorksiteEditorUI() {

    $$$setupUI$$$();


}

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Worksite Editor/Creator");
        WorksiteEditorUI wrkstEdit1 = new WorksiteEditorUI();
        jFrame.add(wrkstEdit1.getMainPanel());
        jFrame.pack();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}