import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Taschenrechner {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Taschenrechner");
        frame.setLayout(new BoxLayout(frame,BoxLayout.PAGE_AXIS));
        frame.setContentPane(new Taschenrechner().Taschenrechner);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private void getOperator(String btnOperation){
        math_operator=btnOperation.charAt(0);
        ergebnis1=ergebnis1+Double.parseDouble(textBildschirm.getText());
        textBildschirm.setText("");

    }


    public Taschenrechner() {
        btnEins.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnEinsText=textBildschirm.getText()+ btnEins.getText();
                textBildschirm.setText(btnEinsText);
            }
        });
        btnZwei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnZweiText= textBildschirm.getText()+btnZwei.getText();
                textBildschirm.setText(btnZweiText);
            }
        });
        btnDrei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnDreiText=textBildschirm.getText()+btnDrei.getText();
                textBildschirm.setText(btnDreiText);
            }
        });
        btnVier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnVierText= textBildschirm.getText()+btnVier.getText();
                textBildschirm.setText(btnVierText);
            }
        });
        btnFunf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnFunfText = textBildschirm.getText()+ btnFunf.getText();
                textBildschirm.setText(btnFunfText);
            }
        });
        btnSechs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnSechsText=textBildschirm.getText()+btnSechs.getText();
                textBildschirm.setText(btnSechsText);
            }
        });
        btnSieben.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnSiebenText=textBildschirm.getText()+btnSieben.getText();
                textBildschirm.setText(btnSiebenText);
            }
        });
        btnAcht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnAchtText=textBildschirm.getText()+btnAcht.getText();
                textBildschirm.setText(btnAchtText);
            }
        });
        btnNeun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnNeunText=textBildschirm.getText()+btnNeun.getText();
                textBildschirm.setText(btnNeunText);
            }
        });
        btnNull.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnNullText=textBildschirm.getText()+btnNull.getText();
                textBildschirm.setText(btnNullText);
            }
        });
        btnPunkt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textBildschirm.getText().equals("")){
                    textBildschirm.setText("0.");
                }
                else if(textBildschirm.getText().contains(".")){
                    btnPunkt.setEnabled(false);
                }
                else {
                    String btnPunktText=textBildschirm.getText()+btnPunkt.getText();
                    textBildschirm.setText(btnPunktText);
                }
                btnPunkt.setEnabled(true);
            }
        });
        btnSumme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnSummeText=btnSumme.getText();
                getOperator(btnSummeText);

            }
        });
        btnRest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnRestText=btnRest.getText();
                getOperator(btnRestText);
            }
        });


        btnMultiplikation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnMultiplikationText=btnMultiplikation.getText();
                getOperator(btnMultiplikationText);
            }
        });
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btnDivisionText=btnDivision.getText();
                getOperator(btnDivisionText);
            }
        });
        btnGleich.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                switch (math_operator){

                    case'+':
                        ergebnis2=ergebnis1 + Double.parseDouble(textBildschirm.getText());
                        break;
                    case '-':
                        ergebnis2=ergebnis1 - Double.parseDouble(textBildschirm.getText());
                        break;
                    case '*':
                        ergebnis2=ergebnis1 * Double.parseDouble(textBildschirm.getText());
                        break;
                    case '/':
                        ergebnis2=ergebnis1 / Double.parseDouble(textBildschirm.getText());
                        break;


                }
                textBildschirm.setText(Double.toString(ergebnis2));
                ergebnis1=0;
            }
        });
        btnReiniger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ergebnis2=0;
                textBildschirm.setText("");
            }
        });
    }
    private char math_operator;
    private double ergebnis1=0.0;
    private double ergebnis2=0.0;

    private JPanel Taschenrechner;
    private JTextField textBildschirm;
    private JButton btnEins;
    private JButton btnZwei;
    private JButton btnDrei;
    private JButton btnVier;
    private JButton btnFunf;
    private JButton btnSechs;
    private JButton btnSieben;
    private JButton btnAcht;
    private JButton btnNeun;
    private JButton btnNull;
    private JButton btnPunkt;
    private JButton btnSumme;
    private JButton btnRest;
    private JButton btnMultiplikation;
    private JButton btnDivision;
    private JButton btnGleich;
    private JButton btnReiniger;
}
