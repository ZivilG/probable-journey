package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    protected final JLabel lblText;
    private final JButton btnText;
    private final String CONST_THIS_IS_LABEL="This is a label";
    private final String CONST_THIS_IS_BUTTON="This is a button";
    protected static final String CONST_BUTTON_IS_PRESSED="Button is pressed";

    public Main() {
        JPanel pnlMain=new JPanel();
        pnlMain.setLayout(null);;

        lblText=new JLabel(CONST_THIS_IS_LABEL);
        lblText.setFont(new Font ("SansSerif",Font.BOLD, 14));
        lblText.setBounds(40,200,300,30);
        pnlMain.add(lblText);

        btnText=new JButton(CONST_THIS_IS_BUTTON);
        btnText.setFont(new Font ("SansSerif",Font.BOLD, 14));
        btnText.setBounds(40,100,200,40);
        pnlMain.add(btnText);
        btnTextOnClick btnText1=new btnTextOnClick(btnText);
        btnText1.setLabel(lblText);
        btnText.addActionListener(btnText1);

        this.add(pnlMain);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(400,400);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main mainForm = new Main();
                    mainForm.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            ;
        });
    }
}