import javax.swing.*;


public class Main {


    public static void main(String[] args) {

        WordConter wordConter = new WordConter();
        wordConter.setVisible(true);
        wordConter.setContentPane(wordConter.getPanelMain());
        wordConter.setTitle("Words Counter Application");
        wordConter.setSize(300, 200);
        wordConter.setVisible(true);
        wordConter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}