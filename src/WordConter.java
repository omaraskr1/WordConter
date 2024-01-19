import javax.swing.*;


public class WordConter extends JFrame{
    private JTextField txtParagraph;
    private JButton button1;
    private  JPanel panelMain;
    private JLabel txtdisplay;

    public JPanel getPanelMain() {
        return panelMain;
    }



    public WordConter() {
    button1.addActionListener(e -> {
        String text = txtParagraph.getText();
        String[] words = text.split("\\s+");
        int wordCount = words.length;
//            System.out.println("Word Count: " + wordCount);
        txtdisplay.setText("the entered paragraph has: " + wordCount + " words");
    });
}

}
